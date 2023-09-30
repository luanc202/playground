package com.learnspring.learnspringboot.game;

import com.learnspring.learnspringboot.GamingConsole;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

