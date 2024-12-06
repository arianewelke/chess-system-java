package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        //inicia a partida, cria um tabuleiro (8,8) e chamo o InitialSetup
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece [][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    //metodo responsavel por iniciar a partida de Xadrez, colocando as pecas no tabuleiro
    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(1, 2));
        board.placePiece(new King(board, Color.BLACK), new Position(4, 0));
        board.placePiece(new King(board, Color.WHITE), new Position(4, 7));

    }
}
