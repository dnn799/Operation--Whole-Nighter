package game.common;

import game.common.network.NetworkElement;
import game.common.network.Sendable;

/**
 * Parent class for server and client player
 *
 */
public abstract class Player extends GameObject implements Sendable{
	private NetworkElement<PlayerValues> myNetworkElement;
	private PlayerValues myStats;
	public ConcurrentCircularBuffer<PlayerValues> myBuffer;
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ConcurrentCircularBuffer<PlayerValues> getMyBuffer() {
		return myBuffer;
	}
	@Override
	public void setMyStats(GameObjectValues stats) {
		myStats=(PlayerValues) stats;
		
	}
	/**
	 * @return the myNetworkElement
	 */
	public NetworkElement<PlayerValues> getMyNetworkElement() {
		return myNetworkElement;
	}
	/**
	 * @param myNetworkElement the myNetworkElement to set
	 */
	public void setMyNetworkElement(NetworkElement<PlayerValues> myNetworkElement) {
		this.myNetworkElement = myNetworkElement;
	}
	/**
	 * @return the myStats
	 */
	public GameObjectValues getMyStats() {
		return myStats;
	}
	/**
	 * @param myStats the myStats to set
	 */
	public void setMyStats(PlayerValues myStats) {
		this.myStats = myStats;
	}

	
}
