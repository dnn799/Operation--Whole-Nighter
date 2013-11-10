package game.common;

import java.util.ArrayList;

/**
 * Class used to keep track of the level, on both the client and the server.
 * NOTE: maybe branch level into ClientLevel and ServerLevel, have ClientLevel do the heavy lifting and have ServerLevel just do checksums to keep load off server
 */
public class Level {
	ArrayList<Player> players;
	ArrayList<Wall> walls;
	
	public void update(){
		
	}

}
