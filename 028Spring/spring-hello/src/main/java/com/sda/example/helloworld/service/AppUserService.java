package com.sda.example.helloworld.service;

import com.sda.example.helloworld.model.AppUser;
import com.sda.example.helloworld.model.AppUserDto;
import com.sda.example.helloworld.model.EditAppUserDto;
import com.sda.example.helloworld.model.RegisterAppUserDto;
import com.sda.example.helloworld.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public AppUserDto registerAppUser(RegisterAppUserDto toRegister) {
        AppUser newUser = new AppUser(toRegister.getRegisterEmail(), toRegister.getRegisterPassword());

        AppUser created = appUserRepository.save(newUser);

        return AppUserDto.create(created);
    }

    public List<AppUserDto> listUsers() {
        List<AppUser> users = appUserRepository.findAll();

        return users.stream()
                .map(AppUserDto::create)
                .collect(Collectors.toList());
    }

    public Optional<AppUser> editUser(Long id, EditAppUserDto editAppUserDto) {
        Optional<AppUser> searched = appUserRepository.findById(id);

        if (searched.isPresent()) {
            AppUser user = searched.get();

            if (editAppUserDto.getPassword() != null) {
                user.setEmail(editAppUserDto.getPassword());
            }

            if (editAppUserDto.getName() != null) {
                user.setName(editAppUserDto.getName());
            }

            if (editAppUserDto.getSurname() != null) {
                user.setSurname(editAppUserDto.getSurname());
            }

            user = appUserRepository.save(user);

            return Optional.of(user);
        }

        return Optional.empty();
    }
}
