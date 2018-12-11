package model.players;

import model.players.strategy.StrategyShot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;


public class AI extends Player {

	private StrategyShot strategyShot;

	public AI(String name, StrategyShot strategyShot) {
		super(name);
		this.strategyShot = strategyShot;
		// TODO Auto-generated constructor stub
	}
	
	public void putShip() {
		Random random = new Random();
		for (int i = 2; i < 6; i++) {
			boolean put = false;
			int xDebut = random.nextInt(SIZE);
			int yDebut = random.nextInt(SIZE);
			
			while (!put) {
				xDebut = random.nextInt(SIZE);
				yDebut = random.nextInt(SIZE);
				put = ajouterShip(xDebut, yDebut, i);
				if (i == 3) {
					if (shipCount[i-1] < 2)
						put = false;
				}
			}
		}
		
	}

	public void tirer(){
		if (strategyShot != null){
			strategyShot.shot(enemy, nbTireMiss, nbTireToucher, SIZE);
		}else{
			System.out.println("oups il y a un problème");
		}
	}
	
	/*public void randomShot(){
		
		if (nbTireMiss+nbTireToucher < SIZE*SIZE){
			Random random = new Random();
			int xDebut = random.nextInt(SIZE);
			int yDebut = random.nextInt(SIZE);
			
			if (enemy.getShip(xDebut, yDebut) != null) enemy.setShipPart(xDebut,yDebut);
			else enemy.setShipGrill(xDebut, yDebut);
			nbTireMiss++;
		}
		//cibleToucher(xDebut, yDebut);

	}*/

}
