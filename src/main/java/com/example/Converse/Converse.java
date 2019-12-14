package com.example.Converse;

import com.example.Converse.model.User;
import com.example.Converse.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@RequestMapping("/home")
@RequiredArgsConstructor
public class Converse {

    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    List<User> home() {
        System.out.println("NJ: " + userService.findAll());
        return userService.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(Converse.class, args);
    }

}
