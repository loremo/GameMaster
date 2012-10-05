package core;

public class Action {
	
	public Piece piece;
	public int x;
	public int y;
	
	public Action(Piece piece, int x, int y) {
		this.piece = piece;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}

}
