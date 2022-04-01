package com.game.domain;

import java.util.ArrayList;

public class FrameGameList extends ArrayList<FrameGame> {

    @Override
    public boolean add(final FrameGame frameGame) {
        if (Integer.valueOf(0).equals(this.size())) {
            return super.add(frameGame);
        }

        if (Integer.valueOf(1).equals(this.size())) {
            final FrameGame lastFrame = this.get(this.size() - 1);
            if (lastFrame.isSpare()) {
                lastFrame.addExtraPoints(frameGame.getFirstPlay());
            }
            if (lastFrame.isStrike()) {
                lastFrame.addExtraPoints(frameGame.getFirstPlay());
            }
            return super.add(frameGame);
        }

        final FrameGame penultimaFrame = this.get(this.size() - 2);
        final FrameGame lastFrame = this.get(this.size() - 1);

        if (penultimaFrame.isStrike() && lastFrame.isStrike()) {
            penultimaFrame.addExtraPoints(frameGame.getFirstPlay());
        }

        if (penultimaFrame.isStrike() && !lastFrame.isStrike()) {
            penultimaFrame.addExtraPoints(lastFrame.getSecundPlay());
        }

        if (lastFrame.isStrike() && frameGame.isStrike()) {
            lastFrame.addExtraPoints(frameGame.getFirstPlay());
        } else if (lastFrame.isStrike() && !frameGame.isStrike()) {
            lastFrame.addExtraPoints(frameGame.getTotalPoints());
        } else if (lastFrame.isSpare()) {
            lastFrame.addExtraPoints(frameGame.getFirstPlay());
        }

        return super.add(frameGame);
    }
}
