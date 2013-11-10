package game.server;

import game.common.Player;

/**
 * Class used for storing player data on the server and communicating with the client
 *
 */
public class ServerPlayer extends Player implements Runnable{
	
	public void update(){
		//try to read recieved buffer using lock system
		//update stats accordingly
		//create new thread to send via send buffer
	}

	@Override
	public void run() {
		
		
	}

}
