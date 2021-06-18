package main.java.players;

import main.java.Board;
import main.java.enums.Symbols;
import main.java.strategies.IWinnerSelectionStrategy;

public abstract class IPlayer {

    public abstract boolean makeMove(Board board, IWinnerSelectionStrategy winnerSelectionStrategy);
    public Symbols symbol;

    public IPlayer(Symbols symbol) {
        this.symbol = symbol;
    }
}
