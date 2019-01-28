package com.tutorial.spring.iocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TutorialApplication implements Application {

    @Autowired
    @Qualifier("goodService")
    Service service;

    @Value("${special.operation:default operation}")
    String operation;

    public Service getService() {
        return service;
    }

    public String runOperation() {
        if (getService().getOperation() != null) {
            return getService().getOperation();
        } else {
            return operation;
        }
    }

}
