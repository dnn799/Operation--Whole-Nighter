package game.client;

public class ClientPlayerSender extends Thread {
	ClientPlayer owner;
	
	
	public ClientPlayerSender(ClientPlayer owner) {
		super();
		this.owner = owner;
	}
	@Override
	public void run() {
		owner.getMyNetworkElement().send(owner.getMyStats());
	}

}
