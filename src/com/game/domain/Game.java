package com.game.domain;

public class Game {

    private Player player1;
    private Player player2;

    public Game(final Player player1, final Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getWinner() {
        if (this.player1.getScore().compareTo(player2.getScore()) > 0) {
            return player1.getName();
        }

        return player2.getName();
    }
}
