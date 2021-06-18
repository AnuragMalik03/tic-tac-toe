package main.java;

import java.util.Arrays;

public class Board {
    public char[][] grid;
    int dimension;
    Board(int n){
        dimension = n;
        grid =  new char[n][n];
        for (int i =0 ; i < dimension ; i++){
            for (int j=0; j<dimension;j++){
                grid[i][j] = '-';
            }
        }
    }

    public int getDimensions(){
        return dimension;
    }

    public void print() {
        for (int i =0; i < dimension ; i++){
            for ( int j =0; j < dimension ; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
