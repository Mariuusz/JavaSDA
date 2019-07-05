package com.sda.spring.todo.controller;

import com.sda.spring.todo.model.dto.user.RegisterUserDto;
import com.sda.spring.todo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
// Controller a nie RestController!
public class HomeController {

    @Autowired
    private AppUserService appUserService;

    // Zadanie 1:
    // widok home :
    // lista użytkowników oraz zadań w dwóch oddzielnych tabelach pod sobą
    // th:each
    @GetMapping("/")
    public String getHomePage(Model model) {
        // model to obiekt do którego możemy zamieścić dowolne wartości
        // poprzez dodanie ich jako atrybutu
        model.addAttribute("wartosc", "Tekst do wydrukowania");
        model.addAttribute("page_title", "Home Page");

        // przykładowe dodanie listy
        model.addAttribute("lista", appUserService.getUserList());

        // zwracamy zawsze nazwę naszego widoku (nazwę pliku html bez końcówki '.html')
        return "home";
    }

    @GetMapping("/admin/")
    public String getAdminPage(Model model) {
        // model to obiekt do którego możemy zamieścić dowolne wartości
        // poprzez dodanie ich jako atrybutu
        model.addAttribute("wartosc", "Tekst do wydrukowania");
        model.addAttribute("page_title", "Home Page");

        // przykładowe dodanie listy
        model.addAttribute("lista", appUserService.getUserList());

        // zwracamy zawsze nazwę naszego widoku (nazwę pliku html bez końcówki '.html')
        return "home";
    }
}
