package game.common.engine;

import game.common.GameObject;


/**
 * Interface implemented by all collision capable game objects.
 *
 */
public interface Collidable {
	/**
	 * Function used to trigger collision behavior.
	 * @param o The game object THIS object collided with.
	 */
	public void collided(GameObject o);

}
