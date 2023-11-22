package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if ('X' != board[row][index]) {
                result = false;
                break;
            }
        }
        return result;
    }

}