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
/*
        Game game = new Game();
        game.playGame();
    */
        List<Player> playerList;
        // initialize user interface
        UserInterface GameInter = new UserInterface();
        // launch menu interface
        playerList = GameInter.beginMenuInterface();
        // play game
        playerList = GameInter.playGame(playerList);
        // display scores
        GameInter.scoreBoard(playerList);
    }
}
