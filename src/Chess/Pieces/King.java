package Chess.Pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRow()][getBoard().getColumn()];
		return mat;
	}
}
