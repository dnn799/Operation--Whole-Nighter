package game.common;

import game.common.network.Sendable;


public class Receiver extends Thread {
	Sendable owner;
	
	
	
	public Receiver(Sendable owner) {
		super();
		this.owner = owner;
	}



	@SuppressWarnings("unchecked")
	public void run(){
		while(true){
			try {
				owner.getMyBuffer().push(owner.getMyNetworkElement().receive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
