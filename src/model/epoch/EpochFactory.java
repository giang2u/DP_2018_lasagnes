package model.epoch;

import model.ship.Ship;

public abstract class EpochFactory {
	protected String epochName;
	
	public EpochFactory(){
	}
	
	public abstract Ship buildShip(int x, int y, int size, boolean horizontal);

	
	public String toString() {
		return epochName;
	}
}
