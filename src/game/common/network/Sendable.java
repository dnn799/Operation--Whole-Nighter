package game.common.network;

import game.common.ConcurrentCircularBuffer;
import game.common.GameObjectValues;

public interface Sendable {

	@SuppressWarnings("rawtypes")
	NetworkElement getMyNetworkElement();

	GameObjectValues getMyStats();

	@SuppressWarnings("rawtypes")
	ConcurrentCircularBuffer getMyBuffer();

	void setMyStats(GameObjectValues stats);

}
