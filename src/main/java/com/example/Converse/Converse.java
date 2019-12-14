package com.example.Converse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;

@SpringBootApplication
@RequestMapping("/home")
public class Converse {

    @Autowired
    private EntityManager entityManager;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        System.out.println("NJ: "+entityManager.getTransaction());
        return "Random Message ";
    }

    public static void main(String[] args) {
        SpringApplication.run(Converse.class, args);
    }

}
