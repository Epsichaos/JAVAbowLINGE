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

    // say if a frame isValid or not
    public Boolean isValid() {
        int score1 = this.getFirstLaunch();
        int score2 = this.getSecondLaunch();
        int score = score1 + score2;
        if ((score1<0)||(score1>10)||(score2<0)||(score2>10)||(score<0)||(score>10)) {
            return false;
        }
        else {
            return true;
        }
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
