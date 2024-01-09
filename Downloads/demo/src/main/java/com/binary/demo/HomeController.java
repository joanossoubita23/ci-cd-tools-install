package com.binary.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public  String greeting(){
        return "Hello World Welcome to Java";
    }
    @GetMapping("/food")
    public  String lunchTime(){
        return "Lets go on eat";
    }
}
