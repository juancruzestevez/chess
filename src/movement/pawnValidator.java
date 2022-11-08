package movement;

import Objects.Board;
import Objects.Point;

public class pawnValidator implements MoveValidator{

    private MoveValidator limitv1;
    private MoveValidator limitv2;
    private MoveValidator fowardv;
    private MoveValidator horizontalv;
    private MoveValidator diagonalv;

    public pawnValidator() {
        limitv1 = new LimitValidator(1);
        limitv2 = new LimitValidator(2);
        fowardv = new FowardValidator();
        horizontalv = new HorizontalValidator();
        diagonalv = new DiagonalValidator();
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        if (fowardv.validate(originPoint, pointMove, board)){
            if (pointMove.getPiece() != null){
                return diagonalv.validate(originPoint, pointMove, board) && limitv1.validate(originPoint, pointMove, board);
            }else {
                if (originPoint.getPiece().getMoved()){
                    return horizontalv.validate(originPoint, pointMove, board) && limitv2.validate(originPoint, pointMove, board);
                }else {
                    return horizontalv.validate(originPoint, pointMove, board) && limitv1.validate(originPoint, pointMove, board);
                }
            }
        }else {
            return false;
        }
    }
}
