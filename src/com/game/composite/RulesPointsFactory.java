package com.game.composite;

import com.game.domain.FrameGame;
import com.game.domain.FrameGameList;
import com.game.interfaces.RulesScoreInteface;

import java.util.ArrayList;
import java.util.List;

public class RulesPointsFactory {

    private List<RulesScoreInteface> roles = new ArrayList<>();

    public RulesPointsFactory addRole(RulesScoreInteface rolesScore) {
        roles.add(rolesScore);
        return this;
    }

    public void execute(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        for (RulesScoreInteface role : roles) {
            role.buildScore(frameGameList, actualFrameGame);
        }
    }
}
