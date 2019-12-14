package com.example.Converse.spring;

import com.example.Converse.repository.UserRepository;
import com.example.Converse.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public UserService getUserService(UserRepository userRepository) {
        return new UserService(userRepository);
    }
}
