package com.game.domain;

import com.game.composite.ScoringRuleComposite;

import java.util.ArrayList;

public class FrameGameList extends ArrayList<FrameGame> {

    @Override
    public boolean add(final FrameGame frameGame) {
        super.add(frameGame);

        new ScoringRuleComposite()
                .addRole(new LastScoringRule())
                .addRole(new PenultimateScoringRule())
        .execute(this, frameGame);

        return true;
    }
}
