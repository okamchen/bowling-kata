package com.interfaces;

import com.domain.FrameGame;
import com.domain.FrameGameList;

public interface ScoringRuleInteface {

    void buildScore(final FrameGameList frameGameList, final FrameGame actualFrameGame);

}
