package com.tutorial.spring.iocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("goodService")
public class GoodService implements Service {

    @Autowired
    @Qualifier("goodOperation")
    private Operation operation;

    @Override
    public String getOperation() {
        return operation.getResult();
    }
}
