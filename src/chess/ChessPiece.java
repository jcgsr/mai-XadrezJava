package chess;

import boardgame.Piece;
import boardgame.Board;

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
}
