package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        //funcao para imprimir as pecas dessa partida UI, e dentro dessa classe foi criado um metodo chamado printBoard, que vai receber
        //a matriz de pecas da partida

        UI.printBoard(chessMatch.getPieces());
    }
}


