package main.java.players;

import main.java.Board;
import main.java.enums.Symbols;
import main.java.strategies.IWinnerSelectionStrategy;

import java.util.Scanner;

public class HumanPlayer extends IPlayer{
    public HumanPlayer(Symbols symbol) {
        super(symbol);
    }

    @Override
    public boolean makeMove(Board board , IWinnerSelectionStrategy winnerSelectionStrategy) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        if(row < 0 || col < 0 || row > board.getDimensions() || col > board.getDimensions()){
            throw new IllegalArgumentException("Move out of boundary");
        }else if(board.grid[row][col] != '-'){
            throw new IllegalArgumentException("Square is already occupied");
        }else {
            board.grid[row][col] = symbol.symbol;

        }
        return winnerSelectionStrategy.getWinner(board, row, col);
    }
}
