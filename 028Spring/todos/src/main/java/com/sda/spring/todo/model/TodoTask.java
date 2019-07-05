package com.sda.spring.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "todotasks")
@Data
@AllArgsConstructor
public class TodoTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String description;
    private LocalDateTime addTime;
    private boolean done;

    public TodoTask(String title, String description, LocalDateTime addTime) {
        this.title = title;
        this.description = description;
        this.addTime = addTime;
    }
}
