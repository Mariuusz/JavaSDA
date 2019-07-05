package com.sda.spring.todo.model.dto.user;

import com.sda.spring.todo.model.AppUser;
import com.sda.spring.todo.model.TodoTask;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class AppUserTasks {

    private String email;
    private List<TodoTask> tasks;

//    private String title;
//    private String description;
//    private LocalDateTime addTime;
//    private boolean done;

    public static AppUserTasks create(AppUser user) {
        return new AppUserTasks(user.getEmail(), user.getTaskList());
    }
}
