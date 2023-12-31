package com.example.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TestRolesController {

    @GetMapping("/accessAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String accessAdmin(){
        return "Hola, has accedido con rol de administrador";
    }
    @GetMapping("/accessUser")
    @PreAuthorize("hasRole('USER')")
    public String accessUser(){
        return "Hola, has accedido con rol de usuario";
    }
    @GetMapping("/accessInvited")
    @PreAuthorize("hasRole('INVITED')")
    public String accessInvited(){
        return "Hola, has accedido con rol de invitado";
    }
}
