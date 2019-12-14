package com.example.Converse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping("/home")
public class Converse {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Random Message";
    }

    public static void main(String[] args) {
        SpringApplication.run(Converse.class, args);
    }

}
