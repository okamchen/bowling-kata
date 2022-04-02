package com.composite;

import com.domain.FrameGame;
import com.domain.FrameGameList;
import com.interfaces.ScoringRuleInteface;

import java.util.ArrayList;
import java.util.List;

public class ScoringRuleComposite {

    private List<ScoringRuleInteface> roles = new ArrayList<>();

    public ScoringRuleComposite addRole(ScoringRuleInteface rolesScore) {
        roles.add(rolesScore);
        return this;
    }

    public void execute(final FrameGameList frameGameList, final FrameGame actualFrameGame) {
        for (ScoringRuleInteface role : roles) {
            role.buildScore(frameGameList, actualFrameGame);
        }
    }
}
