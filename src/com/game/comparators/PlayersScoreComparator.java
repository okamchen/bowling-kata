package com.game.comparators;

import com.game.domain.Player;

import java.util.Comparator;

public class PlayersScoreComparator implements Comparable<Player>, Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player2.getScore().compareTo(player1.getScore());
    }

    @Override
    public int compareTo(Player player) {
        return player.getScore();
    }
}
