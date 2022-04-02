package com.domain;

public class FrameGame {

    private Integer firstPlay = 0;
    private Integer secundPlay = 0;
    private Integer extraPoints = 0;

    public FrameGame addFirstPlay( Integer play) {
        this.firstPlay = play;
        return this;
    }

    public FrameGame addSecundPlay( Integer play) {
        this.secundPlay = play;
        return this;
    }

    public void addExtraPoints( Integer points) {
        this.extraPoints = this.extraPoints + points;
    }

    public Integer getFirstPlay() {
        return this.firstPlay;
    }

    public Integer getSecundPlay() {
        return this.secundPlay;
    }

    public Integer getTotalPoints() {
        return this.firstPlay + this.secundPlay;
    }

    public Integer getTotalAndExtraPoints() {
        return this.firstPlay + this.secundPlay + this.extraPoints;
    }

    public Boolean isStrike() {
        return Integer.valueOf(10).equals(this.firstPlay);
    }

    public Boolean isSpare() {
        if (this.isStrike()){
            return false;
        }

        Integer totalPoints = 0;
        if (this.firstPlay != null) {
            totalPoints = totalPoints + this.firstPlay;
        }

        if (this.secundPlay != null) {
            totalPoints = totalPoints + this.secundPlay;
        }

        return Integer.valueOf(10).equals(totalPoints);
    }

}
