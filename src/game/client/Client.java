package game.client;

import game.RaceGame;
import game.common.engine.Engine;

/**
 * Class used to run the game, open window and display world.
 *
 */
public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engine.init();//init game engine
		RaceGame.start();//start the game
		Engine.kill();//display menu
	}

}
