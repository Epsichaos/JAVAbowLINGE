package com.xp.bowling;

import java.util.ArrayList;
import java.util.List;

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

    public void setPlayer(Player pl) {
        playerList.add(pl);
    }

    public void launchFrame(int playerNumber, Frame fr) {
       playerList.get(playerNumber).setFrame(fr.getFirstLaunch(), fr.getSecondLaunch());
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getScoreFrame(Player player, int nbFrame) {
        int frameNumber = nbFrame - 1;
        Frame nextFrame;
        int score = 0;

        Frame playerFrame = player.getFrameList().get(frameNumber);
        // if the current frame is a strike
        if(playerFrame.isStrike()) {
            nextFrame = player.getFrameList().get(frameNumber + 1);
            if(frameNumber<9) {
                if(nextFrame.isStrike()) {
                    score = playerFrame.getSum() + nextFrame.getSum() + player.getFrameList().get(frameNumber +2).getFirstLaunch();
                    return score;
                }
                else {
                    score = playerFrame.getSum() + nextFrame.getSum();
                    return score;
                }
            }
        }
        // if the current frame is a spare
        if(playerFrame.isSpare()) {
            nextFrame = player.getFrameList().get(frameNumber + 1);
            score = playerFrame.getSum() + nextFrame.getFirstLaunch();
            return score;
        }
        // if the frame is not a strike or a spare
        else {
            score = 2;
            return score;
        }
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
        UserInterface GameInter = new UserInterface();
        playerList = GameInter.beginMenuInterface();
    }
}
