package com.example.exampleproject;

import com.example.exampleproject.model.Freeboard;
import com.example.exampleproject.model.Users;
import com.example.exampleproject.repository.FreeboardRepository;
import com.example.exampleproject.repository.UsersRepository;
import com.example.exampleproject.service.UserPasswordHashClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ExampleProjectApplication {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private FreeboardRepository freeboardRepository;

    @Autowired
    private UserPasswordHashClass userPasswordHashClass;

    public static void main(String[] args) {
        SpringApplication.run(ExampleProjectApplication.class, args);
    }


    @PostConstruct
    public void initUsers(){
        Users users = Users.builder()
                .userId("11@11.com")
                .username("우종선")
                .password(userPasswordHashClass.getSHA256("1234"))
                .build();
        usersRepository.save(users);
    }
    @PostConstruct
    public void initFreeboard(){
        Freeboard freeboard = Freeboard.builder()
                .title("hello")
                .content("content")
                .writer("11@11.com")
                .build();
        freeboardRepository.save(freeboard);
    }


}

