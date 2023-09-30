package com.learnspring.learnspringframework.dep_injection.example1.setter_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass {
    Dependecy1 dependecy1;
    Dependecy2 dependecy2;

    @Autowired
    public void setDependecy1(Dependecy1 dependecy1) {
        System.out.println("Setter Injection - Dependency 1");
        this.dependecy1 = dependecy1;
    }

    @Autowired
    public void setDependecy2(Dependecy2 dependecy2) {
        System.out.println("Setter Injection - Dependency 2");
        this.dependecy2 = dependecy2;
    }

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
public class DepInjectionLauncherApplicationSetterbased {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplicationSetterbased.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}
