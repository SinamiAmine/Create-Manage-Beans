package com.domestic.learnspringframework;

import com.domestic.learnspringframework.game.GameRunner;
import com.domestic.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

    public static void main(String[] args ){
        //var game = new MarioGame();
        // 1 . Object Creation
        var game = new SuperContraGame();
        // 2 . Object Creation + Wiring of Dependencies
        // Game is dependency of Game Runner
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
