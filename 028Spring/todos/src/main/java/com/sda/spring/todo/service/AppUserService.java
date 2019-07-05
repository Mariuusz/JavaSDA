package com.sda.spring.todo.service;

import com.sda.spring.todo.model.AppUser;
import com.sda.spring.todo.model.TodoTask;
import com.sda.spring.todo.model.dto.user.*;
import com.sda.spring.todo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class AppUserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AppUserRepository appUserRepository;

    /**
     * Metoda rejestracji użytkownika - przyjmuje dto, a wewnątrz zamienia go na obiekt
     * usera. Z danych w dto stworzony został użytkownik.
     *
     * @param registerUserDto - dto z danymi z rejestracji
     */
    public Optional<AppUser> registerUser(RegisterUserDto registerUserDto) {
        registerUserDto.setRegister_email(registerUserDto.getRegister_email().toLowerCase());

        // Tworzymy usera
        // weryfikuje hasła
        if (registerUserDto.getRegister_password().equals(registerUserDto.getRegister_password_confirm())) {
            // sprawdzam czy taki uzytkownik (email) nie istnieje
            if (appUserRepository.countByEmail(registerUserDto.getRegister_email()) <= 0) {
                AppUser createdUser = new AppUser(
                        registerUserDto.getRegister_email(),
                        registerUserDto.getRegister_password());

                // szyfrowanie hasła użytkownika tuż po wypełnieniu formularza rejestracji
                createdUser.setPassword(
                        passwordEncoder.encode(
                                createdUser.getPassword()));

                // wykorzystujemy repository żeby zapisać usera w bazie
                createdUser = appUserRepository.save(createdUser);

                return Optional.of(createdUser);
            }
        }

        return Optional.empty();
    }

    public Optional<AppUser> editUser(Long id, EditUserDto dto) {
        // wyciągam z bazy danych użytkownika z podanym id
        Optional<AppUser> searchedUser = appUserRepository.findById(id);
        // jeśli udało się go odnaleźć
        if (searchedUser.isPresent()) {
            // edytujemy - najpierw wyciągamy go z optional'a
            AppUser user = searchedUser.get();

            // ustawiam edytowane przez użytkownika pola
            user.setAddress(dto.getEdited_address());
            user.setName(dto.getEdited_name());

            // aby zapobiec modyfikowaniu na null
            if (dto.getEdited_surname() != null) {
                user.setSurname(dto.getEdited_surname());
            }

            // zapisuje użytkownika - po lewej stronie przypisuje do zmiennej user
            // użytkownika zwróconego przez bazę danych (zmodyfikowanego)
            user = appUserRepository.save(user);

            // zwracam zmodyfikowany wpis
            return Optional.of(user);
        }
        // jeśli nie udało się znaleźć usera, zwracamy pusty optional
        return Optional.empty();
    }

    /**
     * Metoda zwraca nam listę użytkowników z zasłoniętymi/usuniętymi wybranymi polami (nie ma hasła
     * oraz listy tasków).
     *
     * @return - lista AppUserDTO - nie AppUser.
     */
    public List<AppUserDto> getUserList() {
        List<AppUser> list = appUserRepository.findAll();

        return list.stream()
                .map(user -> AppUserDto.createDto(user))
                .collect(Collectors.toList());
    }

    public Optional<AppUser> unregister(Long id, UnregisterDto dto) {
        // jeśli nie podano id, to nie mogę szukać użytkownika
        if (id != null) {
            // szukam w bazie użytkownika do usunięcia
            Optional<AppUser> searchedUser = appUserRepository.findById(id);
            if (searchedUser.isPresent()) {
                AppUser user = searchedUser.get();
                // po odnalezieniu wyciągam go z optionala

                // weryfikuje że mam poprawne hasło i email usuwanego użytkownika
                if (user.getPassword().equals(dto.getUnregister_password()) &&
                        user.getEmail().equals(dto.getUnregister_email())) {

                    // usuwam użytkownika
                    appUserRepository.delete(user);

                    // zwracam usuwany rekord
                    return Optional.of(user);
                }
            }
        }

        // jeśli coś się nie udało to zwracamy empty
        return Optional.empty();
    }

    public Optional<AppUser> getUserData(Long id) {
        return appUserRepository.findById(id);
    }

    public boolean addTaskToUser(String username, TodoTask addedTask) {
        Optional<AppUser> userOptional = appUserRepository.findByEmail(username);
        if (userOptional.isPresent()) {
            AppUser user = userOptional.get();
            user.getTaskList().add(addedTask);

            // update'uje listę tasków w bazie
            appUserRepository.save(user);
            return true;
        }
        return false;
    }

    public Optional<AppUser> findUserByEmail(String username) {
        return appUserRepository.findByEmail(username);
    }

    public List<AppUserTasks> getAllTasks() {
        return appUserRepository.findAll().stream()
                .map(AppUserTasks::create)
                .collect(Collectors.toList());
    }

    public void removeUser(Long userId) {
        appUserRepository.deleteById(userId);
    }
}
