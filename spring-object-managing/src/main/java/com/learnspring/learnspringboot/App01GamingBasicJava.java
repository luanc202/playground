package com.learnspring.learnspringboot;

import com.learnspring.learnspringboot.game.GameRunner;
import com.learnspring.learnspringboot.game.MarioGame;
import com.learnspring.learnspringboot.game.PacmanGame;
import com.learnspring.learnspringboot.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        var game = new SuperContraGame();
        var game2 = new MarioGame();
        var game3 = new PacmanGame();
        var gameRunner = new GameRunner(game3);
        gameRunner.run();
    }
}
