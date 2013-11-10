package game.server;

import game.common.ConcurrentCircularBuffer;
import game.common.Player;
import game.common.Loader;
import game.common.Receiver;
import game.common.PlayerValues;

/**
 * Class used for storing player data on the server and communicating with the client
 *
 */
public class ServerPlayer extends Player{
	ConcurrentCircularBuffer<PlayerValues> myBuffer;
	Loader myLoader;
	Receiver myReceiver;
	
	
	
	
	

}
