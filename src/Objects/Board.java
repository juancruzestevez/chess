package Objects;

import java.util.ArrayList;
import java.util.List;

public class Board{
    public List<Point> square;

    public Board() {
        square = new ArrayList<>();
    }

    public Board(Board board, Point beforeChange, Point afterChange){
        square = board.getSquare();
        square.get(square.indexOf(afterChange)).setPiece(beforeChange.getPiece());
        square.get(square.indexOf(afterChange)).setPiece(null);
    }

    public Point indexOf(int x, int y){
        for (int i = 0; i < square.size(); i++) {
            if (square.get(i).getX() == x && square.get(i).getY() == y){
                return square.get(i);
            }
        }
        return null;
    }

    public List<Point> getSquare() {
        return square;
    }

    public boolean canMove(Point origin, Point newPoint){
        if (origin == newPoint){
            return false;
        }
        if (origin.getPiece() != null){
            for (int i = 0; i < origin.getPiece().getStrictValidator().size(); i++) {
                if (!origin.getPiece().getStrictValidator().get(i).validate(origin, newPoint, this)){
                    return false;
                }
            }
            for (int i = 0; i < origin.getPiece().getStrictValidator().size(); i++) {
                if (origin.getPiece().getStrictValidator().get(i).validate(origin, newPoint, this)) {
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }
}
