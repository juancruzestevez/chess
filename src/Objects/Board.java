package Objects;

import java.util.ArrayList;
import java.util.List;

public class Board{
    public List<Point> square;

    public Board() {
        square = new ArrayList<>();
    }

    public Point indexOf(int x, int y){
        for (int i = 0; i < square.size(); i++) {
            if (square.get(i).getX() == x && square.get(i).getY() == y){
                return square.get(i);
            }
        }
        return null;
    }
}
