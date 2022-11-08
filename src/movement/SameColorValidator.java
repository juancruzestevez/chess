package movement;

import Objects.Board;
import Objects.Point;

public class SameColorValidator implements MoveValidator{
    public SameColorValidator() {
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        return !originPoint.getPiece().getColor().equals(pointMove.getPiece().getColor());
    }
}
