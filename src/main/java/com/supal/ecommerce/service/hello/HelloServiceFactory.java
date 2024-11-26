package com.supal.ecommerce.service.hello;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class HelloServiceFactory {

    private final Map<String, HelloService> services;


    public HelloServiceFactory(List<HelloService> services) {
        this.services = services.stream()
                .collect(Collectors.toMap(s -> s.getClass().getSimpleName(), s -> s));
    }

    public HelloService getService(String type) {
        return services.getOrDefault(type, null);
    }
}
