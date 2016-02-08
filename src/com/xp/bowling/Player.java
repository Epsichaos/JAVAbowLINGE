package com.xp.bowling;

import java.util.List;
import java.util.ArrayList;

import com.xp.bowling.Frame;

/**
 * Created by epsichaos on 04/02/2016.
 */
public class Player {

    // variables
    /*
    * Missing Private Variables :
    * - Where storing the frames ? Tables / List<Int> ???
    * - Where storing the first / seconds launches ?
    */
    private String playerName;
    // --> List de frame ?
    // --> Une frame = (int, int)
    //List<> frameList;
    List<Frame> frameList = new ArrayList<Frame>();

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

    public void setFrame(int firstL, int secondL) {
        frameList.add(new Frame(firstL, secondL));
    }
}
