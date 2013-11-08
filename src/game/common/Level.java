package game.common;

import java.util.ArrayList;

/**
 * Class used to keep track of the level, on both the client and the server.
 *
 */
public class Level {
	ArrayList<Player> players;
	ArrayList<Wall> walls;
	
	public void update(){
		for(Player p:players){
			p.update();
		}
	}

}
