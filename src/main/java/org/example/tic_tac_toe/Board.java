package org.example.tic_tac_toe;

public class Board {
    int n;
    Piece board[][];
    int numberOfCells;
    Board(int n) {
        this.n = n;
        board = new Piece[n][n];
        numberOfCells = n*n;
    }
    public void addToBoard(int row, int col, Player player) {
        board[row][col]=player.piece;
        numberOfCells--;
    }
    public boolean isValidEntry(int row, int col){
        return (board[row][col] == null);
    }
    public boolean freeCells() {
        return numberOfCells > 0;
    }
    public void printBoard() {
        int size = n;
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if (board[i][j] == null)
                    System.out.print(" |");
                else System.out.print(board[i][j].pieceType+" |");
            }
            System.out.println();
        }
    }
}
