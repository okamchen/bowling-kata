package com.game.factory;

import com.game.domain.FrameGame;
import com.game.domain.FrameGameList;
import com.game.interfaces.RolesScoreInteface;

import java.util.ArrayList;
import java.util.List;

public class RolesPointsFactory {

    private List<RolesScoreInteface> roles = new ArrayList<>();

    public RolesPointsFactory addRole(RolesScoreInteface rolesScore) {
        roles.add(rolesScore);
        return this;
    }

    public void build(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        for (RolesScoreInteface role : roles) {
            role.buildScore(frameGameList, actualFrameGame);
        }
    }
}
