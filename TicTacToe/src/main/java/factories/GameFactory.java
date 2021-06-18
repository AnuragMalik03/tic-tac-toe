package main.java.factories;

import main.java.Game;
import main.java.enums.PlayerType;
import main.java.enums.Symbols;
import main.java.players.IPlayer;
import main.java.strategies.ConventionalWinnerSelectionStrategy;

public class GameFactory {

    public static Game launch(int boardDimention, PlayerType playerType1, PlayerType playerType2){
        IPlayer player1 = PlayerFactory.createPlayer(playerType1 , Symbols.X);
        IPlayer player2 = PlayerFactory.createPlayer(playerType1 , Symbols.O);
        return new Game(1, boardDimention , player1, player2, new ConventionalWinnerSelectionStrategy());
    }
}
