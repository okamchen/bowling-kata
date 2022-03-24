package com.game.application;

import com.game.domain.Player;

public class Game {

    private Player player1;
    private Player player2;

    public Game(final Player player1, final Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getWinner() {
        if (this.player1.getTotalPoints().compareTo(player2.getTotalPoints()) > 0) {
            return player1.getName();
        }

        return player2.getName();
    }
}
