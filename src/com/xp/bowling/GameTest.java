package com.xp.bowling;
import com.xp.bowling.Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by epsichaos on 11/02/2016.
 */
public class GameTest {

    @Test
    public void getScoreFrameTest() {
        Game game = new Game();
        Player p = new Player("test");
        game.setPlayer(p);
        Frame fr = new Frame(1,1);
        game.launchFrame(0, fr);
        assertTrue(game.getScoreFrame(game.getPlayer(0), 1) == 2);

    }
}