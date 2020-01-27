package com.jenkins.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class player {

    @GetMapping
    public String getBestPlayer(){
      return "MESSI";
    }
}
