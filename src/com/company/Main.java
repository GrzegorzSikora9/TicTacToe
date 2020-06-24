package com.company;

public class Main {

    public static void main(String[] args) {
	    char[][] gameBoard =    { {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '} };


            printGameBoard(gameBoard);
    }
    public static void printGameBoard (char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            char[] row = gameBoard[i];
            for (int i1 = 0; i1 < row.length; i1++) {
                char c = row[i1];
                System.out.print(c);
            }
            System.out.println();
        }
    }







}
