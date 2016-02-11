package com.xp.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 11/02/2016.
 */
public class FrameTest {

    @Test
    public void testFrameCreation() {
        Frame fr = new Frame(1,2);
        assertTrue(fr.getFirstLaunch()==1 && fr.getSecondLaunch()==2);
    }

    @Test
    public void testStrike() {
        Frame frStrike = new Frame(10,0);
        assertTrue(frStrike.isStrike());
    }

    @Test
    public void testSpare() {
        Frame frSpare1 = new Frame(5,5);
        Frame frSpare2 = new Frame(0,10);
        assertTrue(frSpare1.isSpare() && frSpare2.isSpare());
    }
}