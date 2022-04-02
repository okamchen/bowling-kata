package com.domain;

import com.interfaces.ScoringRuleInteface;

public class PenultimateScoringRule implements ScoringRuleInteface {

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
