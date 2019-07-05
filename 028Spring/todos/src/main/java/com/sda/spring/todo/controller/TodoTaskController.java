package com.sda.spring.todo.controller;

import com.sda.spring.todo.model.TodoTask;
import com.sda.spring.todo.model.dto.task.AddTaskDto;
import com.sda.spring.todo.model.dto.task.EditTaskDto;
import com.sda.spring.todo.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/")
public class TodoTaskController {

    private TodoTaskService todoTaskService;

    @Autowired
    public TodoTaskController(TodoTaskService todoTaskService) {
        this.todoTaskService = todoTaskService;
    }

    @PostMapping("/addTask")
    public ResponseEntity<TodoTask> addTask(@RequestBody AddTaskDto dto) {
        TodoTask createdTask = todoTaskService.addTask(dto);

        return ResponseEntity.ok(createdTask);
    }

    @PostMapping("/editTask/{id}")
    public ResponseEntity<TodoTask> editTask(@PathVariable(name = "id") Long id,
                                             @RequestBody EditTaskDto dto) {
        Optional<TodoTask> editedTask = todoTaskService.editTask(id, dto);

        if (editedTask.isPresent()) {
            return ResponseEntity.ok(editedTask.get());
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/listTasks")
    public ResponseEntity<List<TodoTask>> listTasks() {
        return ResponseEntity.ok(todoTaskService.getTaskList());
    }

    @PostMapping("/changeState/{task_id}")
    public ResponseEntity<TodoTask> changeState(@PathVariable(name = "task_id") Long id) {
        Optional<TodoTask> result = todoTaskService.changeState(id);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.badRequest().build();
    }
}
