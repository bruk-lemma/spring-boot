package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics= Arrays.asList(
        new Topic("spring","Spring Boot","Spring description"),
                new Topic("spring","Spring Boot","Spring description"),
                new Topic("spring","Spring Boot","Spring description")
        );
       public List<Topic> getAllTopics(){
           return topics;
       }
}
