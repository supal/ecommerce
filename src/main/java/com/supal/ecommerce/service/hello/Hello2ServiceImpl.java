package com.supal.ecommerce.service.hello;

import org.springframework.stereotype.Service;

@Service
public class Hello2ServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "world";
    }
}
