package com.example.backend_gestionreleases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendGestionreleasesApplication {
    public String message() { return "test aa";}

    public static void main(String[] args) {
        SpringApplication.run(BackendGestionreleasesApplication.class, args);
    }

}
