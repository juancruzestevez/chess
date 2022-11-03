package Objects;

import movement.MoveValidator;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private String type;
    private Boolean moved = false;
    private COLOR color;

    public List<MoveValidator> moveValidators;

    public Piece(String type, COLOR color, List<MoveValidator> moveValidators) {
        this.type = type;
        this.color = color;
        this.moveValidators=moveValidators;
    }

    public Piece(String type, COLOR color) {
        this.type = type;
        this.color = color;
        moveValidators=new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public Boolean getMoved() {
        return moved;
    }

    public void setMoved(Boolean moved) {
        this.moved = moved;
    }
}
