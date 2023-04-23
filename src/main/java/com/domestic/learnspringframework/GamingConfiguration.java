package com.domestic.learnspringframework;

import com.domestic.learnspringframework.game.GameRunner;
import com.domestic.learnspringframework.game.GamingConsole;
import com.domestic.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {


    @Bean
    public GamingConsole game(){
        return new SuperContraGame();
    }


    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

    //var game = new MarioGame();
    // 1 . Object Creation

    // 2 . Object Creation + Wiring of Dependencies
    // Game is dependency of Game Runner
    /*var gameRunner = new GameRunner(game);
        gameRunner.run();*/
}
