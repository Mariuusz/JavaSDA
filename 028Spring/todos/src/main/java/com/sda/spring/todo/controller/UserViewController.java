package com.sda.spring.todo.controller;

import com.sda.spring.todo.model.AppUser;
import com.sda.spring.todo.model.TodoTask;
import com.sda.spring.todo.model.dto.task.AddTaskDto;
import com.sda.spring.todo.model.dto.user.LoginDto;
import com.sda.spring.todo.model.dto.user.RegisterUserDto;
import com.sda.spring.todo.service.AppUserService;
import com.sda.spring.todo.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class UserViewController {

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private TodoTaskService todoTaskService;

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("register_user_dto", new RegisterUserDto());
        model.addAttribute("page_title", "Register Page");

        // pobranie s

        return "addUser";
    }

    @PostMapping("/register")
    public String getRegisterPage(RegisterUserDto dto, Model model) {
        // jeśli nie zgadzają się hasła (password and confirm password)
        // to zachowanie strony jest inne
        Optional<AppUser> user = appUserService.registerUser(dto);

        if (!user.isPresent()) {
            model.addAttribute("register_user_dto", new RegisterUserDto());
            model.addAttribute("page_title", "Register Page");
            model.addAttribute("error_message", "Passwords do not match.");

            // nie udało się - zwracam użytkownikowi ponownie ten sam widok
            // i dodałem mu error_message żeby powiadomić go o błędzie
            return "addUser";
        } else {
            // udało się - więc przekierowuje go na home page.
            return "redirect:/";
        }
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        // zwracamy stronę logowania.
        // WE WSZYSTKICH STRONACH DOPISANA JEST page_title ŻEBY ZMIENIAĆ AKTYWNĄ ZAKŁADKĘ
        model.addAttribute("login_user_dto", new LoginDto());
        model.addAttribute("page_title", "Login Page");
        return "login";
    }

//    // metoda post login ma dokonywać redirect na home page
//    @PostMapping("/login")
//    public String getLoginPage(LoginDto dto) {
//        // todo: tutaj powstanie logowanie!
//
//        return "redirect:/";
//    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("page_title", "About Page");
        return "about";
    }

    @GetMapping("/editTask/{task_id}")
    public String editTask(@PathVariable(name = "task_id") Long id, Model model) {
        Optional<TodoTask> task = todoTaskService.getTaskById(id);
        if (task.isPresent()) {
            TodoTask todoTask = task.get();

            model.addAttribute("addedTask", new AddTaskDto(id, todoTask.getTitle(), todoTask.getDescription()));
            model.addAttribute("page_title", "Edit Task Page");

            return "addTask";
        }

        return "redirect:/error?error_msg=CANNOT_FIND_TASK";
    }

    @GetMapping("/addTask")
    public String addTaskPage(Model model) {
        model.addAttribute("addedTask", new AddTaskDto());
        model.addAttribute("page_title", "Add Task Page");

        return "addTask";
    }

    @PostMapping("/addTask")
    public String addTaskPage(AddTaskDto addTaskDto) {
        // szukam email
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (addTaskDto.getChange_id() == null) { // dodanie
            // dodanie zadania do bazy
            TodoTask addedTask = todoTaskService.addTask(addTaskDto);

            // po dodaniu zadania do bazy, dodaje to zadanie uzytkownikowi
            if (!appUserService.addTaskToUser(user.getUsername(), addedTask)) {
                return "redirect:/error?error_msg=CANNOT_ADD_TASK";
            }
        } else {
            if (!todoTaskService.update(addTaskDto)) {
                return "redirect:/error?error_msg=CANNOT_EDIT_TASK";
            }
        }

        return "redirect:/userInfo";
    }

    @GetMapping("/userInfo")
    public String getUserPage(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User username = (User) auth.getPrincipal();

        Optional<AppUser> user = appUserService.findUserByEmail(username.getUsername());
        if (user.isPresent()) {
            model.addAttribute("task_list", user.get().getTaskList());
            model.addAttribute("task_list_done", user.get().getTaskList().stream().filter(zad -> zad.isDone()).collect(Collectors.toList()));
            model.addAttribute("task_list_not_done", user.get().getTaskList().stream().filter(zad -> !zad.isDone()).collect(Collectors.toList()));
            model.addAttribute("page_title", "User Page");
            return "userPage";
        }

        return "redirect:/error?error_msg=CANNOT_FIND_USER";
    }

    @GetMapping("/change/{task_id}")
    public String changeTaskStatus(@PathVariable(name = "task_id") Long id) {
        todoTaskService.changeState(id);

        return "redirect:/userInfo";
    }

    @GetMapping("/userList")
    public String getUserList(Model model) {
        model.addAttribute("page_title", "User List Page");
        model.addAttribute("users_and_tasks", appUserService.getAllTasks());
        model.addAttribute("users_list", appUserService.getUserList());

        return "userList";
    }

    @GetMapping("/deleteUser/{user_id}")
    public String deleteUser(@PathVariable(name = "user_id") Long userId) {
        appUserService.removeUser(userId);

        return "redirect:/userList";
    }
}

