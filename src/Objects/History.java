package Objects;

import java.util.ArrayList;
import java.util.List;

public class History {
    private Board board;
    private List<Piece> deadPieces;
    private Player turn;

    public History(Board board, List<Piece> deadPieces, Player turn) {
        this.board = board;
        this.deadPieces = deadPieces;
        this.turn = turn;
    }

    public Board getBoard() {
        return board;
    }

    public List<Piece> getDeadPieces() {
        return deadPieces;
    }

    public Player getTurn() {
        return turn;
    }
}
