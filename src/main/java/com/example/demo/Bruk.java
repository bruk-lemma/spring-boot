package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bruk  {

    @RequestMapping("/bruk")
    public String sayhi(){
        return  "hi bruk";
    }
}
