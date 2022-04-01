package com.game.domain;

import com.game.interfaces.RolesScoreInteface;

public class PenultimateScoreRoles implements RolesScoreInteface {

    @Override
    public void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        if (frameGameList.size() < 2) {
            return;
        }

        final FrameGame penultimate = frameGameList.get(frameGameList.size() - 2);
        final FrameGame lastFrame = frameGameList.get(frameGameList.size() - 1);

        if (penultimate.isStrike() && lastFrame.isStrike()) {
            penultimate.addExtraPoints(actualFrameGame.getFirstPlay());
        }

        if (penultimate.isStrike() && !lastFrame.isStrike()) {
            penultimate.addExtraPoints(lastFrame.getSecundPlay());
        }
    }
}
