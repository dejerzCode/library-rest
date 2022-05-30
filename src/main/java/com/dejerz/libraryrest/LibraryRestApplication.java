package com.dejerz.libraryrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class LibraryRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryRestApplication.class, args);
    }
}
