package com.game.domain;

import com.game.factory.RolesPointsFactory;

import java.util.ArrayList;

public class FrameGameList extends ArrayList<FrameGame> {

    @Override
    public boolean add(final FrameGame frameGame) {
        new RolesPointsFactory()
                .addRole(new LastScoreRoles())
                .addRole(new PenultimateScoreRoles())
        .build(this, frameGame);

        return super.add(frameGame);
    }
}
