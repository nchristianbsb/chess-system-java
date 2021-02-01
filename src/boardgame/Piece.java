package boardgame;

public class Piece {
	
	protected Position position;
	private Board boar;
	
	public Piece() {
	}
	
	public Piece(Board boar) {
		this.boar = boar;
		position = null;
	}

	protected Board getBoar() {
		return boar;
	}
	
	
	
	

}
