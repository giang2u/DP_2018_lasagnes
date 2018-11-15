package model.ship;

public abstract class Ship {
	
	protected int posX, posY, size, hp;
	protected boolean  horizontal;
	
	public Ship(int x, int y, int size, boolean horizontal) {
		this.posX = x;
		this.posY = y;
		this.size = size;
		this.hp = size;
		this.horizontal = horizontal;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getSize() {
		return size;
	}

	public int getHp() {
		return hp;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
