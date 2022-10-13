public class Piece {
    private String type;
    private Boolean moved = false;
    private COLOR color;

    public MoveValidator moveValidator;

    public Piece(String type, COLOR color, MoveValidator moveValidator) {
        this.type = type;
        this.color = color;
        this.moveValidator=moveValidator;
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
