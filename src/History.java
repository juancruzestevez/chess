import java.util.ArrayList;

public class History {
    private Board board;
    private ArrayList<Piece> deadPieces;
    private Player turn;

    public History(Board board, ArrayList<Piece> deadPieces, Player turn) {
        this.board = board;
        this.deadPieces = deadPieces;
        this.turn = turn;
    }
}
