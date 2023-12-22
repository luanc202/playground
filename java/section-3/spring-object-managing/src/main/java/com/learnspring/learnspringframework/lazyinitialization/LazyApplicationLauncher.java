package com.learnspring.learnspringframework.lazyinitialization;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {}
@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do something");
    }
}

@Configuration
@ComponentScan
public class LazyApplicationLauncher {
    public static void main(String[] args) {
        try (var context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(LazyApplicationLauncher.class);) {
            System.out.println("Context initialization complete");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
