package com.tutorial.spring.iocdi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("proxy")
public class BadService implements Service {

    public String getOperation(){
        return "bad operation of bad service";
    }
}
