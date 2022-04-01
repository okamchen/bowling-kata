package com.game.domain;

import com.game.interfaces.RulesScoreInteface;

public class PenultimateScoreRules implements RulesScoreInteface {

    @Override
    public void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        if (Integer.valueOf(1).equals(frameGameList.size())) {
            return;
        }

        if (frameGameList.size() > 2) {
            final FrameGame lastFrame = frameGameList.get(frameGameList.size() - 2);
            final FrameGame penultimate = frameGameList.get(frameGameList.size() - 3);

            if (penultimate.isStrike() && lastFrame.isStrike()) {
                penultimate.addExtraPoints(actualFrameGame.getFirstPlay());
            }
        }
    }
}
