package movement;

import Objects.Board;
import Objects.Point;

public class CantEatValidator implements MoveValidator{
    public CantEatValidator() {
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        if (pointMove.getPiece() != null){
            return false;
        }else{
            return true;
        }
    }
}
