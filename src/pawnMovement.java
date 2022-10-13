public class pawnMovement implements MoveValidator {

    @Override
    public boolean canMove(Point originPoint, Point pointMove, COLOR color, boolean hasMoved, Board board) {
        if (color == COLOR.WHITE){
            if (pointMove.getY() == originPoint.getY()+2 && pointMove.getX() == originPoint.getX() && hasMoved){
                return true;
            }
            if (pointMove.getY() == originPoint.getY()+1 && pointMove.getX() == originPoint.getX() ){
                return true;
            }
        }
    }
}
