package Objects;

import movement.MoveValidator;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private String type;
    private Boolean moved = false;
    private COLOR color;

    public List<MoveValidator> moveValidators;
    public List<MoveValidator> strictValidator;

    public Piece(String type, COLOR color, List<MoveValidator> moveValidators, List<MoveValidator> strictValidator) {
        this.type = type;
        this.color = color;
        this.moveValidators = moveValidators;
        this.strictValidator = strictValidator;
    }

    public Piece(String type, COLOR color) {
        this.type = type;
        this.color = color;
        moveValidators = new ArrayList<>();
        strictValidator = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public Boolean getMoved() {
        return moved;
    }

    public COLOR getColor() {
        return color;
    }

    public List<MoveValidator> getMoveValidators() {
        return moveValidators;
    }

    public List<MoveValidator> getStrictValidator() {
        return strictValidator;
    }

    public void setMoved(Boolean moved) {
        this.moved = moved;
    }
}
