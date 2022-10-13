public class Original implements GameMode {

    public Board generateBoard() {
        Board board = new Board();
        board.square.add(new Point(1,1, new Piece("tower", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(2,1, new Piece("horse", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(3,1, new Piece("bishop", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(4,1, new Piece("queen", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(5,1, new Piece("king", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(6,1, new Piece("bishop", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(7,1, new Piece("horse", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(8,1, new Piece("tower", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(1,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(2,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(3,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(4,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(5,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(6,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(7,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        board.square.add(new Point(8,2, new Piece("pawn", COLOR.WHITE, new pawnMovement())));
        for (int i = 2; i < 6 ; i++) {
            for (int j = 0; j < 8; j++) {
                board.square.add(new Point(j+1,i+1, null));
            }
        }
        board.square.add(new Point(1,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(2,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(3,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(4,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(5,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(6,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(7,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(8,7, new Piece("pawn",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(1,8, new Piece("tower",  COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(2,8, new Piece("horse",  COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(3,8, new Piece("bishop", COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(4,8, new Piece("queen",  COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(5,8, new Piece("king",   COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(6,8, new Piece("bishop", COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(7,8, new Piece("horse",  COLOR.BLACK, new pawnMovement())));
        board.square.add(new Point(8,8, new Piece("tower",  COLOR.BLACK, new pawnMovement())));
        return board;
    }


    public Player netxTurn() {
        return null;
    }


    public boolean hasWon() {
        return false;
    }
}
