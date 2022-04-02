package com.domain;

import com.comparators.PlayersScoreComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    private List<Player> players = new ArrayList<>();

    public Game addPlayer(final Player player) {
        players.add(player);
        return this;
    }

    public Player getWinner() {
        Collections.sort(players, new PlayersScoreComparator());

        return players.get(0);
    }
}
