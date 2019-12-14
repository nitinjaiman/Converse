package com.example.Converse;

import com.example.Converse.model.User;
import com.example.Converse.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@RequestMapping("/home")
@RequiredArgsConstructor
@Slf4j
public class Converse {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    List<User> home() {
        log.info("NJ: " + userService.findAll());
        return userService.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(Converse.class, args);
    }

}
