import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private Player player1;
    private Player player2;
    private int time1;
    private int time2;
    private Player winner = null;
    private Board board;
    private GameMode gameMode;
    private Map<Integer, History> history;
    private Player turn;
    private ArrayList<Piece> deadPieces;

    public Game(Player player1, Player player2, int time1, int time2, GameMode gameMode) {
        this.player1 = player1;
        this.player2 = player2;
        this.time1 = time1;
        this.time2 = time2;
        turn = player1;
        history = new HashMap<Integer,History>();
        deadPieces = new ArrayList<Piece>();
        this.gameMode = gameMode;
        board = gameMode.generateBoard();
    }
}
