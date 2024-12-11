package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        //a quantidade de rows e columns tem que ser pelo menos um, entao aplica a condicao
        //
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: there must be at least one row and column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    //metodo para retornar a peça dada a uma linha e coluna
    //programacao defensiva para testar
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    //sobrecarga do metodo, retorna a peça pela posição
    //
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    //metodo placePiece vai na matriz das pecas, na linha e na coluna, e vai atribuir nessa posicao a peca que veio como argumento
    //a matriz de pecas (piece) esta declarada no tabuleiro (inicio do codigo)
    public void placePiece(Piece piece, Position position) {
        if (thereIsPiece(position)) {
            throw new BoardException("There is already a piece on position" + position);
        }
        //informar que a peca não esta mais na posicao nula e sim na posicao informada
        //
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    //metodo auxiliar para testar pela linha e coluna (mais facil do que testar pela posicao)
    //
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}