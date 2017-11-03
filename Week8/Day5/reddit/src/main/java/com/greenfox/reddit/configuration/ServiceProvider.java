package com.greenfox.reddit.configuration;

import com.greenfox.reddit.service.PostService;
import com.greenfox.reddit.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceProvider {

    @Bean
    public PostService postService() {
        return new PostService();
    }

    @Bean
    UserService userService() {
        return new UserService();
    }
}