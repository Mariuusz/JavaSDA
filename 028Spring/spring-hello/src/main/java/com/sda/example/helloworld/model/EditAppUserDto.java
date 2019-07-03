package com.sda.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditAppUserDto {
    private String password;
    private String name;
    private String surname;
}
