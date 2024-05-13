package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece piece[][];
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		piece = new Piece[rows][columns];
	}

	public synchronized int getRow() {
		return rows;
	}

	public synchronized void setRow(int row) {
		this.rows = row;
	}

	public synchronized int getColumns() {
		return columns;
	}

	public synchronized void setColumns(int columns) {
		this.columns = columns;
	}
	
	
}
