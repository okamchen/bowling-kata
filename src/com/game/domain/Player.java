package com.game.domain;

import java.util.List;

public class Player {

    private String name;
    private List<FrameGame> frames = new FrameGameList();

    public Player(final String name) {
        this.name = name;
    }

    public FrameGame addFrame() {
        final FrameGame frame = new FrameGame();

        this.frames.add(frame);

        return frame;
    }

    public Integer getScore() {
        final Integer[] totalPoints = {0};
        this.frames.stream().forEach(frame -> {
            totalPoints[0] = totalPoints[0] + frame.getTotalPins();
        });

        return totalPoints[0];
    }

    public String getName() {
        return this.name;
    }
}
