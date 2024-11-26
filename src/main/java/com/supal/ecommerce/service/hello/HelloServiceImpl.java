package com.supal.ecommerce.service.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
