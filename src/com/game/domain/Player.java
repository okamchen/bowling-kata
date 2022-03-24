package com.game.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<FrameGame> frames = new ArrayList<>();

    public Player(final String name) {
        this.name = name;
    }

    public FrameGame addFrame() {
        final FrameGame frame = new FrameGame();

        this.frames.add(frame);

        return frame;
    }

    public Integer getTotalPoints () {
        final Integer[] totalPoints = {0};
        frames.stream().forEach(frame -> {
            if (frame.isStrike()) {

            }

            if (frame.isSpare()) {

            }

            totalPoints[0] = totalPoints[0] + frame.getTotalPins();

        });

        return totalPoints[0];
    }

    public String getName() {
        return this.name;
    }
}
