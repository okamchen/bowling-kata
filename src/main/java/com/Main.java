package com;

import com.domain.FrameGame;
import com.domain.Game;
import com.domain.Player;

public class Main {

    public static void main(String[] args) {
        final Player player1 = new Player("Oelton");

        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));
        player1.addFrame(new FrameGame().addFirstPlay(10));

        final Player player2 = new Player("Joao");
        player2.addFrame(new FrameGame().addFirstPlay(10));
        player2.addFrame(new FrameGame().addFirstPlay(8).addSecundPlay(2));
        player2.addFrame(new FrameGame().addFirstPlay(2).addSecundPlay(5));
        player2.addFrame(new FrameGame().addFirstPlay(5).addSecundPlay(3));
        player2.addFrame(new FrameGame().addFirstPlay(3).addSecundPlay(5));
        player2.addFrame(new FrameGame().addFirstPlay(0).addSecundPlay(10));
        player2.addFrame(new FrameGame().addFirstPlay(1).addSecundPlay(2));
        player2.addFrame(new FrameGame().addFirstPlay(1).addSecundPlay(2));
        player2.addFrame(new FrameGame().addFirstPlay(1).addSecundPlay(2));
        player2.addFrame(new FrameGame().addFirstPlay(1).addSecundPlay(2));

        final Game game = new Game().addPlayer(player1).addPlayer(player2);

        System.out.println("O vencedor é: ".concat(game.getWinner().getName()));
        System.out.println("Total de ponto de '".concat(player1.getName()).concat("' foi de: ").concat(player1.getScore().toString()));
        System.out.println("Total de ponto de '".concat(player2.getName()).concat("' foi de: ").concat(player2.getScore().toString()));
    }
}
