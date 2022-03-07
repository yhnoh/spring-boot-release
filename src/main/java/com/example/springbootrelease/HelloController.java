package com.example.springbootrelease;


import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final Environment env;

    @GetMapping("/hello")
    public String hello(){
        String port = env.getProperty("local.server.port");
        String profiles = env.getProperty("spring.profiles");

        return "port = " + port + " profiles = " + profiles;
    }

}
