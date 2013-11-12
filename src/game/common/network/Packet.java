package game.common.network;

import java.io.*;

public abstract class Packet implements Serializable {
	
	private int myPort;
	private long timeStamp;

	Packet(){setTime();}
	
	private void setTime(){timeStamp=System.currentTimeMillis();}
	
	public long getTime(){return timeStamp;}

}
