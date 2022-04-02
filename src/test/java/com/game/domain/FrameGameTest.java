package com.game.domain;

import com.domain.FrameGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrameGameTest {

    private FrameGame frameGame;

    @Before
    public void setUp() {
        initFrameGame();
    }

    private void initFrameGame() {
        frameGame = new FrameGame();
    }

    @Test
    public void shouldInitialZeroValues() {
        assertEquals(frameGame.getFirstPlay(), Integer.valueOf(0));
        assertEquals(frameGame.getSecundPlay(), Integer.valueOf(0));
        assertEquals(frameGame.getTotalPoints(), Integer.valueOf(0));
        assertEquals(frameGame.getTotalAndExtraPoints(), Integer.valueOf(0));
    }

    @Test
    public void shouldReturnFirstPlayValue() {
        final Integer firstPlayValue = 10;

        frameGame.addFirstPlay(firstPlayValue);

        assertEquals(frameGame.getFirstPlay(), firstPlayValue);
    }

    @Test
    public void shouldReturnSecundPlayValue() {
        final Integer secundPlayValue = 10;

        frameGame.addSecundPlay(secundPlayValue);

        assertEquals(frameGame.getSecundPlay(), secundPlayValue);
    }

    @Test
    public void shouldReturnIsStrikeWhenFirstPlayEqualsTen() {
        final Integer firstPlay = 10;

        frameGame.addFirstPlay(firstPlay);

        assertTrue(frameGame.isStrike());
        assertFalse(frameGame.isSpare());
    }

    @Test
    public void shouldReturnIsSpareWhenTotalPointsEqualsTen() {
        final Integer firstPlay = 5;
        final Integer secundPlay = 5;

        frameGame.addFirstPlay(firstPlay);
        frameGame.addSecundPlay(secundPlay);

        assertTrue(frameGame.isSpare());
        assertFalse(frameGame.isStrike());
    }

    @Test
    public void shouldReturnTheSumTotalOfTheFirstAndSecondRoll() {
        final Integer firstPlay = 5;
        final Integer secundPlay = 5;

        frameGame.addFirstPlay(firstPlay);
        frameGame.addSecundPlay(secundPlay);

        assertEquals(frameGame.getTotalPoints(), Integer.valueOf(firstPlay + secundPlay));
    }


}
