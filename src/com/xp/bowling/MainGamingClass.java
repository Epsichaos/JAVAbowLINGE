package com.xp.bowling;

import java.util.Scanner;
import java.lang.Exception;
import com.xp.bowling.Game;

/**
 * Created by epsichaos on 04/02/2016.
 */
public class MainGamingClass {

    public static void main(String[] args) {

        System.out.println("Hellow World");

        Game game = new Game();
        game.beginGame();
        game.playFrame(game.getPlayer(0), 1);
        game.playFrame(game.getPlayer(0), 2);

        System.out.println("Score :" +  game.getScore(game.getPlayer(0)));
    }
}
