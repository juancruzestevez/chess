package builders;

import Objects.COLOR;
import Objects.Piece;
import Objects.TypePiece;
import movement.*;

import java.util.ArrayList;
import java.util.List;

public class PieceBuilder {

    public static Piece pawnBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new pawnValidator());
        strictvalidators.add(new outOfBoundsValidator());
        return new Piece(TypePiece.PAWN, color, validators, strictvalidators);
    }
    public static Piece kingBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new LimitValidator(1));
        strictvalidators.add(new outOfBoundsValidator());
        validators.add(new HorizontalValidator());
        validators.add(new DiagonalValidator());
        validators.add(new VerticalValidator());
        return new Piece(TypePiece.KING, color, validators, strictvalidators);
    }
    
    public static Piece queenBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new LimitValidator(8));
        strictvalidators.add(new outOfBoundsValidator());
        validators.add(new HorizontalValidator());
        validators.add(new VerticalValidator());
        validators.add(new DiagonalValidator());
        return new Piece(TypePiece.QUEEN, color, validators, strictvalidators);
    }

    public static Piece towerBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new LimitValidator(8));
        strictvalidators.add(new outOfBoundsValidator());
        validators.add(new HorizontalValidator());
        validators.add(new VerticalValidator());
        return new Piece(TypePiece.TOWER, color, validators, strictvalidators);
    }

    public static Piece bishopBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new LimitValidator(8));
        strictvalidators.add(new outOfBoundsValidator());
        validators.add(new DiagonalValidator());
        return new Piece(TypePiece.BISHOP, color, validators, strictvalidators);
    }

    public static Piece horseBuilder(COLOR color){
        List<MoveValidator> strictvalidators = new ArrayList<>();
        List<MoveValidator> validators = new ArrayList<>();
        strictvalidators.add(new SameColorValidator());
        strictvalidators.add(new outOfBoundsValidator());
        validators.add(new MultyJumpValidator(1,2));
        return new Piece(TypePiece.HORSE, color, validators, strictvalidators);
    }
}
