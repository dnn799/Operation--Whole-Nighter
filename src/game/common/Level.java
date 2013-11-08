package game.common;

import java.util.ArrayList;

public class Level {
	ArrayList<Player> players;
	ArrayList<Wall> walls;
	
	public void update(){
		for(Player p:players){
			p.update();
		}
	}

}
