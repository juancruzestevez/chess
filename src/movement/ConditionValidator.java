package movement;

import Objects.Board;
import Objects.Point;

public class ConditionValidator implements MoveValidator{
    private boolean condition;


    public ConditionValidator(boolean condition) {
        this.condition = condition;
    }

    @Override
    public boolean validate(Point originPoint, Point pointMove, Board board) {
        return false;
    }
}
