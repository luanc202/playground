package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learnspring.learnspringframework")
public class App03GameSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GameSpringBeans.class);) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
