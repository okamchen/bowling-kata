package com.game.domain;

import java.util.ArrayList;

public class FrameGameList extends ArrayList<FrameGame> {

    @Override
    public boolean add(final FrameGame frameGame) {
        if (Integer.valueOf(0).equals(this.size())) {
            return super.add(frameGame);
        }

        this.buildLastPlay(frameGame);

        return super.add(frameGame);
    }

    private void buildLastPlay(final FrameGame frameGame) {
        final FrameGame lastFrame = this.get(this.size() - 1);
        if (lastFrame.isStrike()) {
            lastFrame.addExtraPoints(frameGame.getTotalPinsFirstPlay());
        }

        if (lastFrame.isSpare()) {
            lastFrame.addExtraPoints(frameGame.getTotalPinsFirstPlay());
        }
    }
}
