package Objects;

import GameMode.GameMode;

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

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getTime1() {
        return time1;
    }

    public int getTime2() {
        return time2;
    }

    public Player getWinner() {
        return winner;
    }

    public Board getBoard() {
        return board;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public Map<Integer, History> getHistory() {
        return history;
    }

    public Player getTurn() {
        return turn;
    }

    public ArrayList<Piece> getDeadPieces() {
        return deadPieces;
    }

    public void setTime1(int time1) {
        this.time1 = time1;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setTurn(Player turn) {
        this.turn = turn;
    }

    public Player getOtherPlayer(COLOR color){
        if (player1.getColor() == color){
            return player2;
        }else{
            return player1;
        }
    }
}
