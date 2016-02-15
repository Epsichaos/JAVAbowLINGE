package com.xp.bowling;
import com.xp.bowling.Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 11/02/2016.
 */
public class GameTest {

    @Test
    public void setFinalScoreTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        game.setFinalScore(game.getPlayerList().get(0),1);
        assertTrue(game.getPlayerList().get(0).getFinalScore()==1);
    }

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

    @Test
    public void getScoreStrikeCurrentFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(10,0);
        game.launchFrame(0, fr1);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 0);
    }

    @Test
    public void getScoreDoubleStrikeCurrentFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(10,0);
        Frame fr2 = new Frame(10, 0);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 0);
    }

    @Test
    public void getScoreSpareCurrentFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(5,5);
        game.launchFrame(0, fr1);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 0);
    }

    @Test
    public void getTotalScoreTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(1,1);
        Frame fr2 = new Frame(2, 0);
        Frame fr3 = new Frame(2, 0);
        Frame fr4 = new Frame(2, 0);
        Frame fr5 = new Frame(2, 0);
        Frame fr6 = new Frame(2, 0);
        Frame fr7 = new Frame(2, 0);
        Frame fr8 = new Frame(2, 0);
        //Frame fr9 = new Frame(2, 0);
        //Frame fr10 = new Frame(2, 0);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        game.launchFrame(0, fr3);
        game.launchFrame(0, fr4);
        game.launchFrame(0, fr5);
        game.launchFrame(0, fr6);
        game.launchFrame(0, fr7);
        game.launchFrame(0, fr8);
        //game.launchFrame(0, fr9);
        //game.launchFrame(0, fr10);
        assertTrue(game.getTotalScore(game.getPlayer(0)) == 16);
    }

    @Test
    public void getFrameScoreFinalTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(1,2);
        Frame fr2 = new Frame(10, 0);
        Frame fr3 = new Frame(7, 3);
        Frame fr4 = new Frame(4, 2);
        Frame fr5 = new Frame(2, 8);
        Frame fr6 = new Frame(6, 2);
        Frame fr7 = new Frame(2, 8);
        Frame fr8 = new Frame(2, 8);
        Frame fr9 = new Frame(8, 2);
        Frame fr10 = new Frame(6, 4, 8);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        game.launchFrame(0, fr3);
        game.launchFrame(0, fr4);
        game.launchFrame(0, fr5);
        game.launchFrame(0, fr6);
        game.launchFrame(0, fr7);
        game.launchFrame(0, fr8);
        game.launchFrame(0, fr9);
        game.launchFinalFrame(0, fr10);
        assertTrue(game.getTotalScore(game.getPlayer(0)) == 131);
    }

    @Test
    public void getFrameScoreStrikeBeforeLastTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr1 = new Frame(0,0);
        Frame fr2 = new Frame(0, 0);
        Frame fr3 = new Frame(0, 0);
        Frame fr4 = new Frame(0, 0);
        Frame fr5 = new Frame(0, 0);
        Frame fr6 = new Frame(0, 0);
        Frame fr7 = new Frame(0, 0);
        Frame fr8 = new Frame(0, 0);
        Frame fr9 = new Frame(10, 0);
        Frame fr10 = new Frame(10, 1, 0);
        game.launchFrame(0, fr1);
        game.launchFrame(0, fr2);
        game.launchFrame(0, fr3);
        game.launchFrame(0, fr4);
        game.launchFrame(0, fr5);
        game.launchFrame(0, fr6);
        game.launchFrame(0, fr7);
        game.launchFrame(0, fr8);
        game.launchFrame(0, fr9);
        game.launchFinalFrame(0, fr10);
        assertTrue(game.getTotalScore(game.getPlayer(0)) == 32);
    }
}