package game.common;

import game.server.ServerPlayer;

public class Loader extends Thread {
	Player owner;
	
	
	
	
	public Loader(ServerPlayer owner) {
		super();
		this.owner = owner;
	}




	public void run() {
		while(true){
			try {
				owner.setMyStats(owner.myBuffer.pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}

}
