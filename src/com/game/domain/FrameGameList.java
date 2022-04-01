package com.game.domain;

import com.game.composite.RulesPointsFactory;

import java.util.ArrayList;

public class FrameGameList extends ArrayList<FrameGame> {

    @Override
    public boolean add(final FrameGame frameGame) {
        super.add(frameGame);

        new RulesPointsFactory()
                .addRole(new LastScoreRules())
                .addRole(new PenultimateScoreRules())
        .execute(this, frameGame);

        return true;
    }
}
