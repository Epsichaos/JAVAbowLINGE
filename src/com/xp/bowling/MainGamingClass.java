package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Exception;
import com.xp.bowling.Game;


/**
 * Created by epsichaos on 04/02/2016.
 */
public class MainGamingClass {

    public static void main(String[] args) {

        // number of frames
        // -> 2 for testing, 10 in real life
        int frame_number = 2;

        int i  = 0;
        Game game = new Game();
        game.playGame();
        for (Player player : game.getPlayerList()) {
            System.out.println(" - " + player.getPlayerName());
        }
        /*
        System.out.println("Hellow World");
        Game game = new Game();
        List<Player> PList;
        //PList = new ArrayList<Player>();
        PList = game.beginMenuInterface();
        System.out.println("Les joueurs suivant jouent : ");
        for (Player player : PList) {
            System.out.println(" - " + player.getPlayerName());
        }
        System.out.println("\n");
        /*
        Game game = new Game();
        game.beginGame();



        for(i = 0; i<frame_number; i++) {
            for(Player player : game.getPlayerList()) {
                game.playFrame(player, i);
            }
        }

        System.out.println("Score :" +  game.getScore(game.getPlayer(0)));
        */
    }
}
