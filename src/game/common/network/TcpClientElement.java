package game.common.network;

import java.io.IOException;
import java.net.*;


public class TcpClientElement extends NetworkElement {
	private Socket mySocket;
	
	TcpClientElement(InetAddress ip, int port){super();
	if(port==0){port=freePort++;}
	try {
		mySocket=new Socket(ip, myPort=port);
		} catch (IOException e) {System.out.print("Port Unavailable");}
	}
	
	

	@Override
	public void send(Packet p) {
		// TODO Auto-generated method stub
	}

	@Override
	public Packet receive() {
		// TODO Auto-generated method stub
		return null;
	}

}
