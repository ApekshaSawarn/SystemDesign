package org.example.tic_tac_toe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> playerList;
    Game() {
        initializeGame();
    }
    public void initializeGame(){
        board = new Board(3);
        playerList = new LinkedList<>();
        playerList.add(new Player("Player1",new PieceX()));
        playerList.add(new Player("Player2",new PieceO()));
    }
    public void playGame(){
        Scanner sc = new Scanner(System.in);
        boolean winner = true;
        while(winner){
            Player player = playerList.removeFirst();
            System.out.print("Player: "+player.name+" Enter row and column: ");
            String input = sc.next();
            System.out.println();
            int row = input.charAt(0)-'0';
            int column = input.charAt(2)-'0';
            if(board.isValidEntry(row,column))
                board.addToBoard(row,column,player);
            else{
                System.out.println("It's not available!! Try again");
            }
            board.printBoard();
            playerList.addLast(player);
            if(isWinner(row,column)) {
                System.out.println("The game ends!!!\nHurray the winner is :"+player.name);
                winner = false;
            }
            if(!board.freeCells()) {
                System.out.println("Nobody wins. Tie!!!");
                winner = false;
            }
        }
    }

    private boolean isWinner(int row, int col){
        int n=board.n;
        Piece piece= board.board[row][col];
        boolean rows = true, cols = true, diag = true, adjDiag = true;
        for(int i=0; i<n; i++) {
            if ((board.board[row][i] ==null)||(piece != board.board[row][i])) {
                rows = false;
            }
            if ((board.board[i][col] ==null)||(piece != board.board[i][col])) {
                cols = false;
            }
        }

        for(int i=0,j=0; i<n && j<n; i++,j++) {
            if ((board.board[i][j]==null)||(piece != board.board[i][j])) {
                diag = false;
                break;
            }
        }
        for(int i=0,j=n-1; i<n && j>=0; i++,j--) {
            if ((board.board[i][j] ==null)||(piece != board.board[i][j])) {
                adjDiag = false;
                break;
            }
        }
        return rows || cols || diag || adjDiag;
    }
}
