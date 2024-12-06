package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    //criou o contrutor ChessPiece recebendo o Board e o Color. O Board repassa a chamada para o construtor da super classe
    //que e o contrutor da classe Piece
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
