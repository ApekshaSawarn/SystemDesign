package org.example.tic_tac_toe;

public abstract class Piece {
    PieceType pieceType;
    Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
