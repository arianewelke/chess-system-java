package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    //metodo para retornar a peça dada a uma linha e coluna
    public Piece piece (int row, int column) {
        return pieces[row][column];
    }

    //sobrecarga do metodo, retorna a peça pela posição
    public Piece piece (Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    //metodo placePiece vai na matriz das pecas, na linha e na coluna, e vai atribuir nessa posicao a peca que veio como argumento
    //a matriz de pecas (piece) esta declarada no tabuleiro (inicio do codigo)
    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;

        //informar que a peca não esta mais na posicao nula e sim na posicao informada
        piece.position = position;

    }
}
