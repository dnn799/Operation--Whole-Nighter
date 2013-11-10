package game.common;

import game.client.ClientPlayer;

public class Sender extends Thread {
	ClientPlayer owner;
	
	
	public Sender(ClientPlayer owner) {
		super();
		this.owner = owner;
	}
	@Override
	public void run() {
		owner.getMyNetworkElement().send(owner.getMyStats());
	}

}
