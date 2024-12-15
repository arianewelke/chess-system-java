package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    //criou o construtor ChessPiece recebendo o Board e o Color. O Board repassa a chamada para o construtor da super classe
    //que e o construtor da classe Piece
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public Color getColor() {
        return color;
    }

    public void increaseMoveCount() {
        moveCount++;
    }
    public void decreaseMoveCount() {
        moveCount--;
    }


    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;

    }

}
