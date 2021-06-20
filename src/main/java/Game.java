package main.java;

import main.java.players.IPlayer;
import main.java.strategies.IWinnerSelectionStrategy;

import java.util.Scanner;

public class Game {
    //int gameId;
    Board board;
    IPlayer player1;
    IPlayer player2;
    boolean currentPlayer;
    IWinnerSelectionStrategy winnerSelectionStrategy;

    public Game(int gameId, int dimension, IPlayer player1, IPlayer player2, IWinnerSelectionStrategy iWinnerSelectionStrategy) {
        //this.gameId = gameId;
        this.board = new Board(dimension);
        this.player1 = player1;
        this.player2 = player2;
        this.winnerSelectionStrategy = iWinnerSelectionStrategy;
    }

    public IPlayer getCurrentPlayer() {
        return currentPlayer ? player1 : player2;
    }

    public void updateCurrentPlayer() {
        currentPlayer = !currentPlayer;
    }


    public void run() {
        int totalRuns = board.getDimensions() * board.getDimensions();
        int turns = 0;

        while (turns < totalRuns){
            board.print();
            IPlayer currantPlayer = getCurrentPlayer();
            System.out.printf("Player " + currantPlayer.symbol + "'s turn" );
            boolean winner = currantPlayer.makeMove(board ,  winnerSelectionStrategy);
            if (winner){
                board.print();
                printWinner();
                return;
            }
            updateCurrentPlayer();
            turns++;
        }
    }

    private void printWinner() {
        System.out.println("Player " + getCurrentPlayer().symbol + " is a winner");
    }
}
