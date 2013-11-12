package game.common.network;

import java.net.*;

public abstract class NetworkElement {
	
	public static int freePort=27000;
	
	private int myPort;
	NetworkElement(){myPort=0;}
	
	
	
	
	public abstract void send(Packet p); //TODO implement me please
	public Packet receive(){return null;}//TODO implement me please

}
