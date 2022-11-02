package GameMode;

import Objects.Board;
import Objects.Player;

public interface GameMode {
    Board generateBoard();
    Player netxTurn();
    boolean hasWon();
}
