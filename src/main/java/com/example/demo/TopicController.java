package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return Arrays.asList(
                new Topic("spring","Spring Boot","Spring description"),
                new Topic("spring","Spring Boot","Spring description"),
                new Topic("spring","Spring Boot","Spring description")
        );
    }
}
