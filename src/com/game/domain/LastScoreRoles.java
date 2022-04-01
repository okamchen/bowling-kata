package com.game.domain;

import com.game.interfaces.RolesScoreInteface;

public class LastScoreRoles implements RolesScoreInteface {

    @Override
    public void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        if (Integer.valueOf(0).equals(frameGameList.size())) {
            return;
        }

        final FrameGame lastFrame = frameGameList.get(frameGameList.size() - 1);

        if (Integer.valueOf(1).equals(frameGameList.size())) {
            if (lastFrame.isStrike()) {
                lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
            }
            if (lastFrame.isSpare()) {
                lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
            }
        } else {
            if (lastFrame.isStrike() && actualFrameGame.isStrike()) {
                lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
            } else if (lastFrame.isStrike() && !actualFrameGame.isStrike()) {
                lastFrame.addExtraPoints(actualFrameGame.getTotalPoints());
            } else if (lastFrame.isSpare()) {
                lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
            }
        }
    }
}
