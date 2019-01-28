package com.tutorial.spring.iocdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:src/main/resources/tutorial.properties")
public class TutorialConfiguration {

    @Bean
    public Operation goodOperation() {
        return new Operation();
    }

    @Bean
    public BadService badService() {
        return new BadService();
    }

    @Bean
    public GoodService goodService() {
        return new GoodService();
    }

    @Bean
    public Application application() {
        return new TutorialApplication();
    }



}
