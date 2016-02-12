package com.xp.bowling;

/**
 * Created by epsichaos on 08/02/2016.
 */
public class Frame {

    private int firstLaunch;
    private int secondLaunch;
    // only used for last frame 0 by default otherwise
    private int thirdLaunch;

    public Frame(int firstL, int secondL) {
        firstLaunch = firstL;
        secondLaunch = secondL;
        thirdLaunch = 0;
    }

    public Frame(int firstL, int secondL, int thirdL) {
        firstLaunch = firstL;
        secondLaunch = secondL;
        thirdLaunch = thirdL;
    }

    public int getFirstLaunch() {
        return firstLaunch;
    }
    public int getSecondLaunch() {
        return secondLaunch;
    }

    public int getThirdLaunch() {
        return thirdLaunch;
    }

    public void setFirstLaunch(int firstL) {
        firstLaunch = firstL;
    }
    public void setSecondLaunch(int secondL) {
        secondLaunch = secondL;
    }

    public void setThirdLaunch(int thirdL) {
        thirdLaunch = thirdL;
    }

    public int getSum() {
        return firstLaunch + secondLaunch;
    }

    // say if a frame isValid or not
    public Boolean isValid() {
        // if it is not the last frame the third component is always 0 by default
        if(this.getThirdLaunch() == 0) {
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
        // if it is the last frame, the third component can be different from 0
        else {
            int score1 = this.getFirstLaunch();
            int score2 = this.getSecondLaunch();
            int score3 = this.getThirdLaunch();
            if((score1<0)||(score1>10)||(score2<0)||(score2>10)||(score3<0)||(score3>10)) {
                return false;
            }
            else if(score1<10 && (score1+score2)>10) {
                return false;
            }
            else {
                return true;
            }
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
