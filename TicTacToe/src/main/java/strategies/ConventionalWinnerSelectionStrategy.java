package main.java.strategies;

import main.java.Board;

public class ConventionalWinnerSelectionStrategy implements IWinnerSelectionStrategy{
    @Override
    public boolean getWinner(Board board, int row, int col) {
        return (rowCrossed(board.grid , row) || columnCrossed(board.grid, col) || diagonalCrossed(board.grid));
    }

    private boolean diagonalCrossed(char[][] grid) {
        return (diagonal1(grid) || diagonal2(grid));
    }

    private boolean diagonal2(char[][] grid) {
        char ch = grid[0][0];
        if (ch == '-'){
            return false;
        }
        for(int i =1;i < grid.length ; i++){
            if(grid[i][i] == '-' || grid[i][i] != ch){
                return false;
            }
        }
        return true;
    }

    private boolean diagonal1(char[][] grid) {
        int i =0, j = grid.length-1;
        char ch = grid[i][j];
        if (ch == '-'){
            return false;
        }
        while(i < grid.length && j >= 0){
            if(grid[i][j] == '-' || grid[i][j] != ch){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean columnCrossed(char[][] grid , int col) {
        char ch = grid[0][col];
        if (ch == '-'){
            return false;
        }
        for (int i =0; i < grid.length ; i++){
            if(grid[i][col] == '-' || grid[i][col] != ch){
                return false;
            }
        }
        return true;
    }

    private boolean rowCrossed(char[][] grid , int row) {
        char ch = grid[row][0];
        if (ch == '-'){
            return false;
        }
        for (int i =1; i < grid.length ; i++){
            if(grid[row][i] == '-' || grid[row][i] != ch){
                return false;
            }
        }
        return true;
    }
}
