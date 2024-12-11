package boardgame;

//RuntimeExpection para ser uma excecao opcional de ser tratada
public class BoardException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BoardException(String message) {
        super(message);
    }
}
