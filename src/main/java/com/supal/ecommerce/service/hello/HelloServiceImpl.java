package com.supal.ecommerce.service.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        log.info("hello");
        return "hello";
    }
}
