package game.client;

import game.common.Sender;
import game.common.Player;

/**
 * Class used for storing player data and reading player moves.
 *
 */
public class ClientPlayer extends Player {
	Sender mySender;
	ClientPlayerUpdater myUpdater;
}
