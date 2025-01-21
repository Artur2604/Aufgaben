package com.btcag.bootcamp.woche2;

import java.util.Scanner;

public class test {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '.';
    private static final char PLAYER1 = 'X';
    private static final char PLAYER2 = 'O';
    private static char[][] board = new char[ROWS][COLS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spieler1 = getPlayerName(scanner, "Spieler 1");
        String spieler2 = getPlayerName(scanner, "Spieler 2");

        initializeBoard();
        printBoard();

        boolean player1Turn = true;
        boolean gameWon = false;

        while (!gameWon) {
            if (player1Turn) {
                System.out.println(spieler1 + ", wähle eine Spalte (1-7):");
            } else {
                System.out.println(spieler2 + ", wähle eine Spalte (1-7):");
            }

            int col = getColumn(scanner) - 1;
            if (makeMove(col, player1Turn ? PLAYER1 : PLAYER2)) {
                printBoard();
                if (checkWin(player1Turn ? PLAYER1 : PLAYER2)) {
                    gameWon = true;
                    System.out.println((player1Turn ? spieler1 : spieler2) + " hat gewonnen!");
                } else {
                    player1Turn = !player1Turn;
                }
            } else {
                System.out.println("Diese Spalte ist voll. Wähle eine andere Spalte.");
            }
        }
    }

    private static String getPlayerName(Scanner scanner, String player) {
        String name;
        do {
            System.out.println(player + ", gib deinen Namen ein! (Mindestens 3 Zeichen und maximal 15 Zeichen)");
            name = scanner.nextLine();
            if (name.length() < 3 || name.length() > 15) {
                System.out.println("Bitte mindestens 3 oder maximal 15 Zeichen benutzen!");
            }
        } while (name.length() < 3 || name.length() > 15);
        return name;
    }

    private static void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getColumn(Scanner scanner) {
        int col;
        while (true) {
            try {
                col = Integer.parseInt(scanner.nextLine());
                if (col >= 1 && col <= 7) {
                    break;
                } else {
                    System.out.println("Bitte eine Zahl zwischen 1 und 7 eingeben.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte eine Zahl zwischen 1 und 7 eingeben.");
            }
        }
        return col;
    }

    private static boolean makeMove(int col, char player) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == EMPTY) {
                board[i][col] = player;
                return true;
            }
        }
        return false;
    }

    private static boolean checkWin(char player) {
        // Horizontal check
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == player && board[i][j + 1] == player && board[i][j + 2] == player && board[i][j + 3] == player) {
                    return true;
                }
            }
        }

        // Vertical check
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == player && board[i + 1][j] == player && board[i + 2][j] == player && board[i + 3][j] == player) {
                    return true;
                }
            }
        }

        // Diagonal check (bottom-left to top-right)
        for (int i = 3; i < ROWS; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == player && board[i - 1][j + 1] == player && board[i - 2][j + 2] == player && board[i - 3][j + 3] == player) {
                    return true;
                }
            }
        }

        // Diagonal check (top-left to bottom-right)
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == player && board[i + 1][j + 1] == player && board[i + 2][j + 2] == player && board[i + 3][j + 3] == player) {
                    return true;
                }
            }
        }

        return false;
    }
}
