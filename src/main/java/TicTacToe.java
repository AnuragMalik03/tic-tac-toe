package main.java;

import main.java.enums.PlayerType;
import main.java.factories.GameFactory;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        // In reality pass Id of player not type of player
        Game ticTacToe = GameFactory.launch(dimension, PlayerType.HUMAN,PlayerType.HUMAN);
        ticTacToe.run();
    }
}
