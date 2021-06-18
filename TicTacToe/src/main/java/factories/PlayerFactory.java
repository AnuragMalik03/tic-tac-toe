package main.java.factories;

import main.java.enums.PlayerType;
import main.java.enums.Symbols;
import main.java.players.ComputerPlayer;
import main.java.players.HumanPlayer;
import main.java.players.IPlayer;

public class PlayerFactory {

    public static IPlayer createPlayer(PlayerType playerType , Symbols symbol){
        switch (playerType){
            case HUMAN:
                return new HumanPlayer(symbol);
            case COMPUTER:
                // for this you need to pass the strategy which computer will use.
                return new ComputerPlayer(symbol);
            default:
                return null;
        }

    }
}
