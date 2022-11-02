package Objects;

import movement.MoveValidator;

import java.util.List;

public class Piece {
    private String type;
    private Boolean moved = false;
    private COLOR color;

    public MoveValidator moveValidators;

    public Piece(String type, COLOR color, MoveValidator moveValidators) {
        this.type = type;
        this.color = color;
        this.moveValidators=moveValidators;
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
