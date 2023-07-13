package com.ayse.eglencelik.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!!!";
    }

    @GetMapping("/goodbye")
    public String goodByeWorld(){
        return "Good Bye World!!! ";
    }

    @GetMapping("/goodmorning")
    public String goodMorningWorld(){
        return "Good Morning World!!! ";
    }
}
