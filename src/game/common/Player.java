package game.common;

import game.client.PlayerValues;
import game.common.network.NetworkElement;

/**
 * Parent class for server and client player
 *
 */
public abstract class Player extends GameObject{
	private NetworkElement<PlayerValues> myNetworkElement;
	private PlayerValues myStats;
	public void render() {
		// TODO Auto-generated method stub
		
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
	public PlayerValues getMyStats() {
		return myStats;
	}
	/**
	 * @param myStats the myStats to set
	 */
	public void setMyStats(PlayerValues myStats) {
		this.myStats = myStats;
	}

	
}
