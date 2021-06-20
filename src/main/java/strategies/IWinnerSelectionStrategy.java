package main.java.strategies;

import main.java.Board;

public interface IWinnerSelectionStrategy {
    public boolean getWinner(Board board, int row, int col);
}
