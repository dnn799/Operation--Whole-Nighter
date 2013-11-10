package game.server;

import game.common.Player;

/**
 * Class used for storing player data on the server and communicating with the client
 *
 */
public class ServerPlayer extends Player{
	
	
	public void ServerPlayerLoaderRun() {
		while(true){
			setMyStats(myBuffer.pop());	
		}
		
	}
	public void ServerPlayerRecieverRun(){
		while(true){
			myBuffer.push(getMyNetworkElement().recieve());
		}
	}
	

}
