package org.flowdy.controller;

import org.flowdy.services.HelloService;
import org.flowdy.services.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired HelloService helloService;
    @Autowired SquareService squareService;
    @GetMapping("/hello")
    public ResponseEntity<String> greeting(@RequestParam (required = true) String name){
       return new ResponseEntity<>(helloService.receiveGreeting(name), HttpStatus.OK);
    }
    @GetMapping("/square/area")
    public ResponseEntity<Double> area(@RequestParam (required = true) double wide){
        return new ResponseEntity<>(squareService.calculateArea(wide), HttpStatus.OK);
    }
    @GetMapping("/square/circumference")
    public ResponseEntity<Double> circumference(@RequestParam (required = true) double wide){
        return new ResponseEntity<>(squareService.calculateCircumference(wide), HttpStatus.OK);
    }
}
