package game.common;

import game.common.network.Sendable;


public class Loader extends Thread {
	Sendable owner;
	
	
	
	
	public Loader(Sendable owner) {
		super();
		this.owner = owner;
	}




	public void run() {
		while(true){
			try {
				owner.setMyStats((GameObjectValues) owner.getMyBuffer().pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}

}
