package com.xp.bowling;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by epsichaos on 04/02/2016.
 */
public class Player {

    // variables
    private String playerName;
    private int playerNumber;
    List<Frame> frameList = new ArrayList<Frame>();
    // where the final score is stored at the end of the game
    private int finalScore;


    // functions

    // constructor
    public Player(String name) {
        playerName = name;
    }
    public void setPlayerName(String name) {
        playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int pNumber) {
        playerNumber = pNumber;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int fScore) {
        finalScore = fScore;
    }

    public List<Frame> getFrameList() {
        return frameList;
    }

    public void setFrame(int firstL, int secondL) {
        frameList.add(new Frame(firstL, secondL));
    }

    public void setFinalFrame(int firstL, int secondL, int thirdL) {
        frameList.add(new Frame(firstL, secondL, thirdL));
    }
}
