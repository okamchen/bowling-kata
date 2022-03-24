package com.game;

import com.game.application.Game;
import com.game.domain.Player;

public class Main {

    public static void main(String[] args) {
        final Player player1 = new Player("Oelton");
        player1.addFrame().addFirstPlay(10);
        player1.addFrame().addFirstPlay(9).addSecundPlay(0);
        player1.addFrame().addFirstPlay(5).addSecundPlay(5);
        player1.addFrame().addFirstPlay(1).addSecundPlay(7);
        player1.addFrame().addFirstPlay(8).addSecundPlay(2);
        player1.addFrame().addFirstPlay(6).addSecundPlay(4);
        player1.addFrame().addFirstPlay(3).addSecundPlay(3);
        player1.addFrame().addFirstPlay(7).addSecundPlay(2);
        player1.addFrame().addFirstPlay(2).addSecundPlay(8);
        player1.addFrame().addFirstPlay(10);


        final Player player2 = new Player("Joao");
        player2.addFrame().addFirstPlay(9).addSecundPlay(0);
        player2.addFrame().addFirstPlay(9).addSecundPlay(0);
        player2.addFrame().addFirstPlay(5).addSecundPlay(5);
        player2.addFrame().addFirstPlay(1).addSecundPlay(7);
        player2.addFrame().addFirstPlay(8).addSecundPlay(2);
        player2.addFrame().addFirstPlay(6).addSecundPlay(4);
        player2.addFrame().addFirstPlay(3).addSecundPlay(3);
        player2.addFrame().addFirstPlay(7).addSecundPlay(2);
        player2.addFrame().addFirstPlay(2).addSecundPlay(8);
        player2.addFrame().addFirstPlay(6).addSecundPlay(2);

        final Game game = new Game(player1, player2);

        System.out.println("O vencedor é: ".concat(game.getWinner()));
        System.out.println("Total de ponto de '".concat(player1.getName()).concat("' foi de: ").concat(player1.getTotalPoints().toString()));
        System.out.println("Total de ponto de '".concat(player2.getName()).concat("' foi de: ").concat(player2.getTotalPoints().toString()));
    }
}
