package game.common;

import game.common.network.NetworkElement;
import game.common.network.Sendable;

import java.util.ArrayList;

/**
 * Class used to keep track of the level, on both the client and the server.
 * NOTE: maybe branch level into ClientLevel and ServerLevel, have ClientLevel do the heavy lifting and have ServerLevel just do checksums to keep load off server
 */
public abstract class Level implements Sendable{
	ArrayList<Player> players;
	ArrayList<Wall> walls;
	LevelValues myStats;
	ConcurrentCircularBuffer<LevelValues> myBuffer;
	NetworkElement<LevelValues> myNetworkElement;
	@Override
	public ConcurrentCircularBuffer<LevelValues> getMyBuffer() {
		return myBuffer;
	}
	@Override
	public NetworkElement<LevelValues> getMyNetworkElement() {
		return myNetworkElement;
	}
	@Override
	public GameObjectValues getMyStats() {
		return myStats;
	}
	@Override
	public void setMyStats(GameObjectValues stats) {
		myStats=(LevelValues) stats;
		
	}
}
