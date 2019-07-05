package com.sda.spring.todo.model.dto.user;

import com.sda.spring.todo.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {
    private Long id;
    private String email;
    private String name;
    private String surname;
    private String address;

    /**
     * Parametrem metody jest użytkownik appuser,
     * a wynikiem jest model obiektu AppUserDto.
     *
     * @param user - użytkownik z którego tworzymy dto.
     * @return dto użytkownika.
     */
    public static AppUserDto createDto(AppUser user) {
        return new AppUserDto(user.getId(),
                user.getEmail(),
                user.getName(),
                user.getSurname(),
                user.getAddress());
    }
}
