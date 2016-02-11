package com.xp.bowling;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 08/02/2016.
 */
public class PlayerTest {

    //testing player creation
    @Test
    public void testPlayerCreation() {
        Player p1;
        p1 = new Player("toto");
        assertTrue(p1.getPlayerName()=="toto");
    }

    //testing frame creation
    @Test
    public void testFrame() {
        Player p1;
        p1 = new Player("toto");
        p1.setFrame(1,2);
        assertTrue(p1.getFrameList().get(0).getFirstLaunch()==1 && p1.getFrameList().get(0).getSecondLaunch()==2);
    }
}