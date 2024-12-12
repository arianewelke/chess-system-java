package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    //criou o construtor ChessPiece recebendo o Board e o Color. O Board repassa a chamada para o construtor da super classe
    //que e o construtor da classe Piece
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
