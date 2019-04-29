package com.example.demo.controller;

import com.example.demo.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author l
 * @date 2019-04-29
 * @for: HelloController
 */

@SuppressWarnings("ALL")
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/test")
    public String test() {
        return helloService.add(helloService.get());
    }
}

