package game.common.network;

import java.net.*;

public abstract class NetworkElement {
	
	public static int freePort=27000;
	
	protected int myPort;
	NetworkElement(){myPort=0;}
	public int getPort(){return myPort;}
	
	
	
	public abstract void send(Packet p); //TODO implement me please
	public abstract Packet receive(); //TODO implement me please
	
	
}
