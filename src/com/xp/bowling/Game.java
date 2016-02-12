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
        UI GameInter = new UI();
        playerList = GameInter.beginMenuInterface();
    }
}
