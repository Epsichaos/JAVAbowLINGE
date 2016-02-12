package com.xp.bowling;

/**
 * Created by epsichaos on 08/02/2016.
 */
public class Frame {

    private int firstLaunch;
    private int secondLaunch;

    public Frame(int firstL, int secondL) {
        firstLaunch = firstL;
        secondLaunch = secondL;
    }

    public int getFirstLaunch() {
        return firstLaunch;
    }
    public int getSecondLaunch() {
        return secondLaunch;
    }

    public void setFirstLaunch(int firstL) {
        firstLaunch = firstL;
    }
    public void setSecondLaunch(int secondL) {
        secondLaunch = secondL;
    }

    // detect if a frame is a strike
    public Boolean isStrike() {
        if(firstLaunch == 10) {
            return true;
        }
        else {
            return false;
        }
    }

    // detect if a frame is a spare
    public Boolean isSpare() {
        if((firstLaunch + secondLaunch == 10)&& firstLaunch!=10) {
            return true;
        }
        else {
            return false;
        }
    }
}
