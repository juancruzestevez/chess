package movement;

import Objects.Board;
import Objects.Point;

public class VerticalValidator implements MoveValidator{
    private int steps;

    public VerticalValidator(int steps) {
        this.steps = steps;
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        if (originPoint.getX() == pointMove.getX()){

            if (pointMove.getY() - originPoint.getY() <= steps){
                if (pointMove.getY() - originPoint.getY() > 0) {
                    for (int i = originPoint.getY(); i < pointMove.getY(); i++) {
                        if (board.indexOf(pointMove.getX(), i).getPiece() != null) {
                            return false;
                        }
                    }
                    return true;
                }else{
                    for (int i = originPoint.getY(); i > pointMove.getY(); i--) {
                        if (board.indexOf(pointMove.getX(), i).getPiece() != null) {
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
