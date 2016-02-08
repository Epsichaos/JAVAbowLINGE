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

//        TEMPORARY TESTS
//        ----------------
//        int score;
//        Player p1;
//        p1 = new Player();
//        p1.setPlayerName("toto");
//        com.xp.bowling.GameCore.playFrame(p1, 1);
//        System.out.println("The score for the Frame is " + p1.getPlayerScore());
//        if(Game.beginGame()==false) {
//            System.out.println("Partie non commencée");
//        }
//        else {
//            System.out.println("Début de la partie");
//        }

//        System.out.println(p1.getPlayerName());
//        p1.getPlayerScore();

//        int scoreSecondLaunch;
//        System.out.println("Enter your score for the second launch\n");
//        Scanner sc = new Scanner(System.in);
//        scoreSecondLaunch = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Score = " + scoreSecondLaunch);
//        System.out.println(GameCore.getFirstLaunchScore());
//        System.out.println(GameCore.getSecondLaunchScore(2));
    }
}
