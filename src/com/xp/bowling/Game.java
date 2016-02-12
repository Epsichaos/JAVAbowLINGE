package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xp.bowling.Player;

/**
 * Created by epsichaos on 06/02/2016.
 */
public class Game {

    // private variables
    List<Player> playerList = new ArrayList<Player>();

    // fonctions
    public Player getPlayer(int playerNumber) {
        return playerList.get(playerNumber);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getScore(Player player) {
        int i = 0;
        int score = 0;

        Frame previousFrame = new Frame(0,0);
        List<Frame> frameList = player.getFrameList();

        //f frame.getFirstLaunch() == 10 isStrike = true
        for(Frame frame : player.getFrameList()) {
            score = score + frame.getFirstLaunch() + frame.getSecondLaunch();

        }
        return score;
    }

    public void playGame() {
        GameInterface GameInter = new GameInterface();
        playerList = GameInter.beginMenuInterface();
    }
/*
    public void playFrameInterface(Player player, int frameNumber) {
        int firstLaunchScore;
        int secondLaunchScore;
        int userFrameNumber = frameNumber + 1;

        // initialisation
        firstLaunchScore = 0;
        secondLaunchScore = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" > Le joueur " + player.getPlayerName() + " joue la Frame " + userFrameNumber);
        System.out.println("-------------------------------------------");

        // first launch input
        do {
            if(!isValid(firstLaunchScore)) {
                System.out.println(" > Votre premier lancer doit être entre 0 et 10 !");
            }
            System.out.println(" > Rentrez votre score pour le premier lancer ...");
            firstLaunchScore = sc.nextInt();
        } while(!isValid(firstLaunchScore));

        // if the first launch scores a strike
        if(firstLaunchScore == 10) {
            player.setFrame(10, 0);
        }

        // else
        else {
            do {
                if(!isValid(secondLaunchScore)) {
                    System.out.println(" > Votre second lancer doit être entre 0 et 10 !");
                }
                if(!isValid(firstLaunchScore, secondLaunchScore)) {
                    System.out.println(" > La somme de vos deux lancers doit être entre 0 et 10 !");
                }
                System.out.println(" > Rentrez votre score pour le second lancer ...");
                secondLaunchScore = sc.nextInt();
            } while(!isValid(firstLaunchScore, secondLaunchScore) || !isValid(secondLaunchScore));
            player.setFrame(firstLaunchScore, secondLaunchScore);
        }
    }
*/
}
