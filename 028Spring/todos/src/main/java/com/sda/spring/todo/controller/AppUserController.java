package com.sda.spring.todo.controller;

import com.sda.spring.todo.model.AppUser;
import com.sda.spring.todo.model.dto.user.*;
import com.sda.spring.todo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/register")
    public void registerUser(@RequestBody RegisterUserDto registerUserDto) {
        appUserService.registerUser(registerUserDto);
    }

    /**
     * Dla odmiany - metoda editUser która ma PathVariable - zmienną w adresie URL. W Path Variable zdefi-
     * niowana jest nazwa 'id' parametru
     *
     * @param id
     * @param dto
     * @return
     */
    @PostMapping("/editUser/{id}")
    public ResponseEntity<AppUser> editUser(@PathVariable(name = "id") Long id, // dotyczy końcówki URL
                                            @RequestBody EditUserDto dto) { // dotyczy body ( treść ramki http)
        // wywołuję metodę w serwisie, przekazuję id użytkownika do edycji raz dane do zmiany
        Optional<AppUser> editedAppUser = appUserService.editUser(id, dto);

        // jeśli udało się zmodyfikować użytkownika, to znajdzie się on wewnątrz optional'a
        if (editedAppUser.isPresent()) {
            // w wyniku zwrócę edytowanego app usera
            return ResponseEntity.ok(editedAppUser.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/unregister")
//    public ResponseEntity<AppUser> unregister(@RequestBody UnregisterDto dto) {
//    public ResponseEntity<Boolean> unregister(@RequestBody UnregisterDto dto) {
    public ResponseEntity<DeletedUserDto> unregister(@RequestBody UnregisterDto dto) {
        Optional<AppUser> removedUser = appUserService.unregister(dto.getUnregister_id(), dto);
        //############## Opcja 1
//        if(removedUser.isPresent()){
//            return ResponseEntity.ok(removedUser.get());
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        //############### Opcja 2
//        return ResponseEntity.ok(removedUser.isPresent());
        //############### Opcja 3
        if (removedUser.isPresent()) {
            return ResponseEntity.ok(new DeletedUserDto(removedUser.get()));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

    @GetMapping("/listUsers")
    public ResponseEntity<List<AppUserDto>> listUsers() {
        return ResponseEntity.ok(appUserService.getUserList());
    }

    @GetMapping("/getUserData/{user_id}")
    public ResponseEntity<AppUser> getDataOfUser(@PathVariable(name = "user_id") Long id) {
        Optional<AppUser> searchedUser = appUserService.getUserData(id);
        if (searchedUser.isPresent()) {
            return ResponseEntity.ok(searchedUser.get());
        }

        return ResponseEntity.badRequest().build();
    }
}
