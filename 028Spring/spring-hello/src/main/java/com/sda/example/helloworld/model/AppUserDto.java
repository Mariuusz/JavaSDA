package com.sda.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {

    private String email;
    private String name;
    private String surname;

    public static AppUserDto create(AppUser user){
        return new AppUserDto(user.getEmail(), user.getName(), user.getSurname());
    }
}
