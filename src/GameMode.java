public interface GameMode {
    Board generateBoard();
    Player netxTurn();
    boolean hasWon();
}
