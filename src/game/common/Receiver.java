package game.common;


public class Receiver extends Thread {
	Player owner;
	
	
	
	public Receiver(Player owner) {
		super();
		this.owner = owner;
	}



	public void run(){
		while(true){
			try {
				owner.myBuffer.push(owner.getMyNetworkElement().receive());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
