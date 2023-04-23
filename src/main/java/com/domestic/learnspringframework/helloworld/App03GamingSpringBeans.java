package com.domestic.learnspringframework.helloworld;

import com.domestic.learnspringframework.GamingConfiguration;
import com.domestic.learnspringframework.game.GameRunner;
import com.domestic.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args ){
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }
}
