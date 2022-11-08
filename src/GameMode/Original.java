package GameMode;

import Objects.*;
import builders.PieceBuilder;

public class Original implements GameMode {

    public Board generateBoard() {
        Board board = new Board();
        board.square.add(new Point(1,1, PieceBuilder.towerBuilder(COLOR.WHITE )));
        board.square.add(new Point(2,1, PieceBuilder.horseBuilder(COLOR.WHITE )));
        board.square.add(new Point(3,1, PieceBuilder.bishopBuilder(COLOR.WHITE)));
        board.square.add(new Point(4,1, PieceBuilder.queenBuilder(COLOR.WHITE )));
        board.square.add(new Point(5,1, PieceBuilder.kingBuilder(COLOR.WHITE  )));
        board.square.add(new Point(6,1, PieceBuilder.bishopBuilder(COLOR.WHITE)));
        board.square.add(new Point(7,1, PieceBuilder.horseBuilder(COLOR.WHITE )));
        board.square.add(new Point(8,1, PieceBuilder.towerBuilder(COLOR.WHITE )));
        board.square.add(new Point(1,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(2,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(3,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(4,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(5,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(6,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(7,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        board.square.add(new Point(8,2, PieceBuilder.pawnBuilder(COLOR.WHITE  )));
        for (int i = 2; i < 6 ; i++) {
            for (int j = 0; j < 8; j++) {
                board.square.add(new Point(j+1,i+1, null));
            }
        }
        board.square.add(new Point(1,7, PieceBuilder.pawnBuilder(COLOR.BLACK)));
        board.square.add(new Point(2,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(3,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(4,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(5,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(6,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(7,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(8,7, PieceBuilder.pawnBuilder(COLOR.BLACK  )));
        board.square.add(new Point(1,8, PieceBuilder.towerBuilder(COLOR.BLACK )));
        board.square.add(new Point(2,8, PieceBuilder.horseBuilder(COLOR.BLACK )));
        board.square.add(new Point(3,8, PieceBuilder.bishopBuilder(COLOR.BLACK)));
        board.square.add(new Point(4,8, PieceBuilder.queenBuilder(COLOR.BLACK )));
        board.square.add(new Point(5,8, PieceBuilder.kingBuilder(COLOR.BLACK  )));
        board.square.add(new Point(6,8, PieceBuilder.bishopBuilder(COLOR.BLACK)));
        board.square.add(new Point(7,8, PieceBuilder.horseBuilder(COLOR.BLACK )));
        board.square.add(new Point(8,8, PieceBuilder.towerBuilder(COLOR.BLACK )));
        return board;
    }

    public Player netxTurn(Game game, COLOR color) {
        if (game.getPlayer1().getColor() == color){
            return game.getPlayer2();
        }else{
            return game.getPlayer1();
        }
    }


    public void hasWon(Player player, Board board, Game game) {
        boolean hasPiece = false;
        Point kingPoint = board.findPointByPiece(player.getColor(), TypePiece.KING);
        for (int i = kingPoint.getX() - 1; i <= kingPoint.getX() + 1 ; i++) {
            for (int j = kingPoint.getY() - 1; j <= kingPoint.getY() + 1 ; j++) {
                hasPiece = false;
                for (int k = 0; k < board.getSquare().size(); k++) {
                    if (board.canMove(kingPoint, board.indexOf(i, j)) || board.indexOf(i,j).equals(kingPoint)){
                        if (!board.getSquare().get(k).isEmpty()){
                            if (board.getSquare().get(k).getPiece().getColor() != player.getColor()){
                                if (board.canMove(board.getSquare().get(k), kingPoint)){
                                    hasPiece = true;
                                    break;
                                }
                            }
                        }
                    }

                }
                if (!hasPiece){
                    return;
                }

            }
        }
        game.setWinner(game.getOtherPlayer(player.getColor()));
    }
}
