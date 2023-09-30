package com.learnspring.learnspringboot;

import com.learnspring.learnspringboot.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GameSpringBeans {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
