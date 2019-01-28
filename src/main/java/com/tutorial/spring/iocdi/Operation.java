package com.tutorial.spring.iocdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Operation {
    @Value("${operation.result:default good operation}")
    private String result;

    public String getResult() {
        return result;
    }
}
