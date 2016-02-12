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
    public void testFrameGetters1() {
        Frame fr = new Frame(1,2);
        assertTrue(fr.getFirstLaunch()==1);
    }

    @Test
    public void testFrameGetters2() {
        Frame fr = new Frame(1,2);
        assertTrue(fr.getSecondLaunch()==2);
    }

    @Test
    public void testFrameSetters1() {
        Frame fr = new Frame(0,0);
        fr.setFirstLaunch(1);
        assertTrue(fr.getFirstLaunch()==1);
        assertFalse(fr.getFirstLaunch()==3);
    }

    @Test
    public void testFrameSetters2() {
        Frame fr = new Frame(0,0);
        fr.setSecondLaunch(1);
        assertTrue(fr.getSecondLaunch()==1);
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

    @Test
    public void testIsValid() {
        Frame frTrue1 = new Frame(1,5);
        Frame frFalse1 = new Frame(5,6);
        assertTrue(frTrue1.isValid());
        assertFalse(frFalse1.isValid());
    }
}