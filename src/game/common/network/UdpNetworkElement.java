package game.common.network;

import java.net.DatagramSocket;
import java.net.InetAddress;



public class UdpNetworkElement extends NetworkElement {
	private DatagramSocket mySocket;
	private int myPort;
	
	UdpNetworkElement(){
		try{
			mySocket=new DatagramSocket(myPort=freePort++);
		}catch(Exception E){System.out.print("Port unavailable");}
	}

	public void connect(InetAddress ip, int port){
		mySocket.connect(ip, port);
	}
	
	public void destroy(){
		mySocket.close();
	}
	
	public void send(Packet data){
		
	}

}
