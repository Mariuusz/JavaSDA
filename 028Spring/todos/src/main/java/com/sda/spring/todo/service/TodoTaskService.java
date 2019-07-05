package com.sda.spring.todo.service;

import com.sda.spring.todo.model.TodoTask;
import com.sda.spring.todo.model.dto.task.AddTaskDto;
import com.sda.spring.todo.model.dto.task.EditTaskDto;
import com.sda.spring.todo.repository.TodoTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TodoTaskService {
    private TodoTaskRepository todoTaskRepository;

    @Autowired
    public TodoTaskService(TodoTaskRepository todoTaskRepository) {
        this.todoTaskRepository = todoTaskRepository;
    }

    public TodoTask addTask(AddTaskDto dto) {
        TodoTask task = new TodoTask(dto.getAdd_title(),
                dto.getAdd_description(),
                LocalDateTime.now());

        task = todoTaskRepository.save(task);

        return task;
    }

    public Optional<TodoTask> editTask(Long id, EditTaskDto dto) {
        Optional<TodoTask> searchedTask = todoTaskRepository.findById(id);

        if (searchedTask.isPresent()) {
            TodoTask task = searchedTask.get();

            task.setDescription(dto.getEditedDescription());

            task = todoTaskRepository.save(task);

            return Optional.of(task);
        }

        return Optional.empty();
    }

    public List<TodoTask> getTaskList() {
        return todoTaskRepository.findAll();
    }

    public Optional<TodoTask> changeState(Long id) {
        // pobieram z bazy zadanie
        Optional<TodoTask> searchedTask = todoTaskRepository.findById(id);

        // sprawdzam czy w bazie jest wpis z podanym id
        if (searchedTask.isPresent()) {
            // wyciągam go z optionala
            TodoTask task = searchedTask.get();

            // zmieniam stan na przeciwny od aktualnego
            task.setDone(!task.isDone());

            // zapisuje wpis w bazie
            task = todoTaskRepository.save(task);

            // zwracam wynik
            return Optional.of(task);
        }

        return Optional.empty();
    }

    public Optional<TodoTask> getTaskById(Long id) {
        return todoTaskRepository.findById(id);
    }

    public boolean update(AddTaskDto addTaskDto) {
        Optional<TodoTask> task = todoTaskRepository.findById(addTaskDto.getChange_id());
        if (task.isPresent()) {
            TodoTask todoTask = task.get();

            todoTask.setTitle(addTaskDto.getAdd_title());
            todoTask.setDescription(addTaskDto.getAdd_description());

            todoTask = todoTaskRepository.save(todoTask);

            return true;
        }
        return false;
    }
}
