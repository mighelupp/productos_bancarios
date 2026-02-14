package com.example.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola2 {
    private int suma(int a, int b){
        return a+b;
    }
    @GetMapping("/")
    public String hola2(){
        return "Este es otro metodo";
    }
}
