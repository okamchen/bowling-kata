package com.game.domain;

import java.util.ArrayList;
import java.util.List;

public class FrameGame {

    private List<LineGame> lines = new ArrayList<>();

    public FrameGame addFirstPlay(final Integer play) {
        this.lines.add(new LineGame(play));
        return this;
    }

    public FrameGame addSecundPlay(final Integer play) {
        this.lines.add(new LineGame(play));
        return this;
    }

    public Boolean isStrike() {
        return lines.get(0).getPins().equals(10);
    }

    public Boolean isSpare() {
        if (this.isStrike()){
            return false;
        }

        return this.getTotalPins().equals(10);
    }

    public Integer getTotalPins () {
        final Integer[] totalPins = {0};
        lines.stream().forEach(lineGame -> totalPins[0] = totalPins[0] + lineGame.getPins());

        return totalPins[0];
    }

}
