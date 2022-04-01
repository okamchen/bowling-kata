package com.game.domain;

import com.game.interfaces.ScoringRuleInteface;

public class LastScoringRule implements ScoringRuleInteface {

    @Override
    public void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        if (Integer.valueOf(1).equals(frameGameList.size())) {
            return;
        }

        final FrameGame lastFrame = frameGameList.get(frameGameList.size() - 2);
        if (lastFrame.isSpare()) {
            lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
        }

        if (lastFrame.isStrike() && actualFrameGame.isStrike()) {
            lastFrame.addExtraPoints(actualFrameGame.getFirstPlay());
        }

        if (lastFrame.isStrike() && !actualFrameGame.isStrike()) {
            lastFrame.addExtraPoints(actualFrameGame.getTotalPoints());
        }
    }
}
