package com.sda.spring.todo.model.dto.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTaskDto {
    private Long change_id;
    private String add_title;
    private String add_description;
}
