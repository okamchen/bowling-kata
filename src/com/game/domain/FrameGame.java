package com.game.domain;

import java.util.ArrayList;
import java.util.List;

public class FrameGame {

    private List<LineGame> lines = new ArrayList<>();
    private Integer extraPoints = 0;

    public FrameGame addFirstPlay(final Integer play) {
        this.lines.add(new LineGame(play));
        return this;
    }

    public FrameGame addSecundPlay(final Integer play) {
        this.lines.add(new LineGame(play));
        return this;
    }

    public void addExtraPoints(final Integer points) {
        this.extraPoints = extraPoints + points;
    }

    public Boolean isStrike() {
        return lines.get(0).getPins().equals(10);
    }

    public Integer getTotalPinsFirstPlay() {
        return Integer.valueOf(0).equals(this.lines.size()) ? 0 : this.lines.get(0).getPins();
    }

    public Integer getTotalPinsSecundPlay() {
        return this.lines.get(1) != null ? this.lines.get(1).getPins() : 0;
    }

    public Boolean isSpare() {
        if (this.isStrike()){
            return false;
        }

        return this.getTotalPins().equals(10);
    }

    public Integer getTotalPins () {
        final Integer[] totalPonts = {0};
        lines.stream().forEach(lineGame -> totalPonts[0] = totalPonts[0] + lineGame.getPins());
        totalPonts[0] = totalPonts[0] + extraPoints;

        return totalPonts[0];
    }
}
