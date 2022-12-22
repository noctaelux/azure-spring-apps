package com.example.springbootazureapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Saludos desde Azure Spring Apps!";
    }

    @RequestMapping("/saludo/{nombre}")
    public String saludo(@PathVariable String nombre){
        return "Hola, "+nombre+"!";
    }
}
