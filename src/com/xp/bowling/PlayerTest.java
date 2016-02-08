package com.xp.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 08/02/2016.
 */
public class PlayerTest {

    @Test
    public void testPlayerCreation() {
        Player p1;
        p1 = new Player("toto");
        assertTrue(p1.getPlayerName()=="toto");
    }
}