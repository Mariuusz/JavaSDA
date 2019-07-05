package com.sda.spring.todo.model.dto.user;

import com.sda.spring.todo.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletedUserDto {
    private AppUser deletedUser;
}
/*
{
    "deletedUser":{
    {
        "id": 1,
        "email": "user1@gmail.com",
        "name": "Paweł",
        "surname": null,
        "address": null
    }
}
 */
