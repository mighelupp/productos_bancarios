package com.example.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHola {
    @GetMapping("/hola")
    public String hola(){
        return "Hola mundo desde Spring Boot e IntelliJ";
    }
}
