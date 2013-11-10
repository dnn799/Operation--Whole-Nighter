package game.common;

import game.common.network.Sendable;


public class Sender extends Thread {
	Sendable owner;
	
	
	public Sender(Sendable owner) {
		super();
		this.owner = owner;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		owner.getMyNetworkElement().send(owner.getMyStats());
	}

}
