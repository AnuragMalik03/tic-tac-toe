package main.java.players;

import main.java.Board;
import main.java.enums.Symbols;
import main.java.strategies.IWinnerSelectionStrategy;

public class ComputerPlayer extends IPlayer{
    public ComputerPlayer(Symbols symbol) {
        super(symbol);
    }

    @Override
    public boolean makeMove(Board  board, IWinnerSelectionStrategy winnerSelectionStrategy) {
        //Need to implement strategy that computerPlayer will use.
        return false;
    }
}
