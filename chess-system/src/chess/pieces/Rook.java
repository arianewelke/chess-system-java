package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {


    //informo quem e o tabuleiro e a cor da peca e repasso os dados para o construtor da superclasse
    public Rook(Board board, Color color) {
        super(board, color);
    }

    //faco a conversao da peca para String. Chamo o toString para converter a peca em um caracter que representara a peca no tabuleiro
    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
