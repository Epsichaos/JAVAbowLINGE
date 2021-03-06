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

    public void setFinalScore(Player p, int finalScore) {
        p.setFinalScore(finalScore);
    }

    public void launchFrame(int playerNumber, Frame fr) {
        playerList.get(playerNumber).setFrame(fr.getFirstLaunch(), fr.getSecondLaunch());
    }

    public void launchFinalFrame(int playerNumber, Frame fr) {
        playerList.get(playerNumber).setFinalFrame(fr.getFirstLaunch(), fr.getSecondLaunch(), fr.getThirdLaunch());
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> PlaList) {
        playerList = PlaList;
    }

    // get the score for the frame number `nbFrame of Player player
    public int getScoreFrame(Player player, int nbFrame) {
        int frameNumber = nbFrame - 1;
        Frame nextFrame;
        int score = 0;

        int playerFrameListSize = player.getFrameList().size();

        Frame playerFrame = player.getFrameList().get(frameNumber);

        if (nbFrame != 10) {
            // if the current frame is a strike
            if (playerFrame.isStrike()) {
                if (nbFrame == playerFrameListSize) {
                    return 0;
                } else {
                    nextFrame = player.getFrameList().get(frameNumber + 1);
                    // 2 strikes in a row
                    if (nextFrame.isStrike()) {
                        if ((nbFrame == playerFrameListSize - 1) && (nbFrame != 9)) {
                            return 0;
                        } else {
                            if (nbFrame == 9) {
                                score = playerFrame.getSum() + nextFrame.getFirstLaunch() + nextFrame.getSecondLaunch();
                                return score;
                            } else {
                                score = playerFrame.getSum() + nextFrame.getSum() + player.getFrameList().get(frameNumber + 2).getFirstLaunch();
                                return score;
                            }
                        }
                    } else {
                        score = playerFrame.getSum() + nextFrame.getSum();
                        return score;
                    }
                }
            }
            // if the current frame is a spare
            if (playerFrame.isSpare()) {
                if (nbFrame == playerFrameListSize) {
                    return 0;
                } else {
                    nextFrame = player.getFrameList().get(frameNumber + 1);
                    score = playerFrame.getSum() + nextFrame.getFirstLaunch();
                    return score;
                }
            }
            // if the frame is not a strike or a spare
            else {
                score = playerFrame.getSum();
                return score;
            }
        }
        // it is the LAST frame
        else {
            score = playerFrame.getFirstLaunch() + playerFrame.getSecondLaunch() + playerFrame.getThirdLaunch();
            return score;
        }
    }

    // sum of the score for all the frames of a specific player
    public int getTotalScore(Player player) {
        int i;
        int score = 0;
        int end = player.getFrameList().size() + 1;
        for (i = 1; i < end; i++) {
            score = score + getScoreFrame(player, i);
        }
        return score;
    }
}