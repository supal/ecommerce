package com.supal.ecommerce.controller;

import com.supal.ecommerce.service.hello.HelloService;
import com.supal.ecommerce.service.hello.HelloServiceFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloServiceFactory helloServiceFactory;

    public HelloController(HelloServiceFactory helloServiceFactory) {
        this.helloServiceFactory = helloServiceFactory;
    }

    @GetMapping("/sayHello")
    public String hello(@RequestParam String type) {
        HelloService helloService = helloServiceFactory.getService(type);
        if(helloService == null) {
            throw new RuntimeException("No such service: " + type);
        }
        return helloService.hello();
    }
}
