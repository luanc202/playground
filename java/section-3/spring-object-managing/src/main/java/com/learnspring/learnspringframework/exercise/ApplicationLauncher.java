package com.learnspring.learnspringframework.exercise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class ApplicationLauncher {
    public static void main(String[] args) {
        try (var context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(ApplicationLauncher.class);) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
