package br.com.abim.ec.web.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class HelloResource {

    @RequestMapping("/")
    public String index() {
        return "Olá eu sou o seu primeiro Spring Boot com Rest!";
    }

}