package com.learnspring.learnspringframework.dep_injection.example1.field_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass {
    @Autowired
    Dependecy1 dependecy1;
    @Autowired
    Dependecy2 dependecy2;

    public String toString() {
        return "Using " + dependecy1 + " and " + dependecy2;
    }
}

@Component
class Dependecy1 {

}

@Component
class Dependecy2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}
