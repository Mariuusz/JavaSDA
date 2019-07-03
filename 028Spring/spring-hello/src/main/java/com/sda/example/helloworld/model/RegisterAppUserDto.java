package com.sda.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterAppUserDto {
    private String registerEmail;
    private String registerPassword;
}
