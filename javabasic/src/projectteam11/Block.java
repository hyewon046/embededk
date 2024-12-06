package projectteam11;

import java.awt.Color;

public class Block {
	
	private int x;
	private int y;
	private Color Bgcolor;
	private boolean pathYN;
	

	public Block(int x, int y, boolean pathYN) {
		this.x = x;
		this.y = y;
		this.Bgcolor = pathYN == true ? Bgcolor.WHITE : Bgcolor.BLACK;
		this.pathYN = pathYN;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getBgColor() {
		return Bgcolor;
	}

	public void setBgColor(Color color) {
		this.Bgcolor = Bgcolor;
	}

	public boolean ispathYN() {
		return pathYN;
	}

	public void setpathYN(boolean pathYN) {
		this.pathYN = pathYN;
	}

}
