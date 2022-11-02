package movement;

import Objects.Board;
import Objects.Point;

public class HorizontalValidator implements MoveValidator{
    private int steps;

    public HorizontalValidator(int steps) {
        this.steps = steps;
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        if (originPoint.getY() == pointMove.getY()){
            if (pointMove.getX() - originPoint.getX() <= steps){
                if (pointMove.getX() - originPoint.getX() > 0) {
                    for (int i = originPoint.getX(); i < pointMove.getX(); i++) {
                        if (board.indexOf(i, originPoint.getY()).getPiece() != null) {
                            return false;
                        }
                    }
                    return true;
                }else{
                    for (int i = originPoint.getX(); i > pointMove.getX(); i--) {
                        if (board.indexOf(i, originPoint.getY()).getPiece() != null) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
