package game.common.network;

import game.common.GameObject;

public abstract class Packet {
	
	private long timeStamp;

	Packet(){setTime();}
	
	private void setTime(){timeStamp=System.currentTimeMillis();}
	
	public long getTime(){return timeStamp;}

}
