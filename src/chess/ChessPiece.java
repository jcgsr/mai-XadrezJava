package chess;

import boardgame.Piece;
import boardgame.Board;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

  private Color color;

  // Constructor
  public ChessPiece(Board board, Color color) {
    super(board);
    this.color = color;
  }

  // Getters
  public Color getColor() {
    return color;
  }

  protected boolean isThereOpponentPiece(Position position) {
    ChessPiece p = (ChessPiece) getBoard().piece(position);
    return p != null && p.getColor() != color;
  }
}
