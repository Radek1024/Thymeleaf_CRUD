package com.radek.thymeleaf_crud.controller;

import com.radek.thymeleaf_crud.entity.Librarian;
import com.radek.thymeleaf_crud.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    @PostMapping("/admin")
    public String addLibrarian(@RequestBody Librarian librarian){
        adminService.addLibrarian(librarian);
        return String.format("Saved %s", librarian);
    }

    @GetMapping("/librarians")
    public String getLibrarians(Model model){
        model.addAttribute("librarians", adminService.getLibrarians());
        return "Librarians";
    }

}
