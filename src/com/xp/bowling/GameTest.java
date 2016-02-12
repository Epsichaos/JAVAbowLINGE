package com.xp.bowling;
import com.xp.bowling.Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 11/02/2016.
 */
public class GameTest {

    @Test
    public void getScoreBasicFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr = new Frame(1,1);
        game.launchFrame(0, fr);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 2);
    }

    @Test
    public void getScoreStrikeFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(10,0);
        Frame fr2 = new Frame(5, 2);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 17);
    }

    @Test
    public void getScoreDoubleStrikeFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(10,0);
        Frame fr2 = new Frame(10, 0);
        Frame fr3 = new Frame(2, 4);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        game.launchFrame(0, fr3);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 22);
    }

    @Test
    public void getScoreSpareFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(5,5);
        Frame fr2 = new Frame(2,3);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 12);
    }
}