package com.company;

import java.util.*;

public class Main {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
	    char[][] gameBoard =    { {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '},
                                {'-', '+', '-', '+', '-'},
                                {' ', '|', ' ', '|', ' '} };

	    //Printing the gameBoard
        printGameBoard(gameBoard);

        while (true){
        //Seting up writing possibility in console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placment (1-9)");
        int playerPos = scan.nextInt();

        placePiece(gameBoard, playerPos, "player");
        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;
        placePiece(gameBoard, cpuPos, "cpu");

        printGameBoard(gameBoard); }



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

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
        } else if(user.equals("cpu")){
            symbol = 'O'; }


        switch(pos) {
             case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 3, 5);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List midColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(3, 5, 7);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(leftColumn);
        winningConditions.add(midColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(cross1);
        winningConditions.add(cross2);


        return "";


    }






}
