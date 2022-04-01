package com.game.interfaces;

import com.game.domain.FrameGame;
import com.game.domain.FrameGameList;

public interface ScoringRuleInteface {

    void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame);

}
