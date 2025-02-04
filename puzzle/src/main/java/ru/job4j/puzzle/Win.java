package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[][] board) {
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (monoHorizontal(board, index)
                    || monoVertical(board, index))) {
                return true;
            }
        }
        return false;
    }
}
