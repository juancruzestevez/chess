public interface MoveValidator {
    boolean canMove(Point originPoint, Point pointMove, COLOR color, boolean hasMoved, Board board);
}
