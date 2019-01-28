package com.tutorial.spring.iocdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TutorialConfiguration.class)) {
            Application app = context.getBean("application", Application.class);
            System.out.println("Hello World! "  + app.runOperation());

        }
    }
}
