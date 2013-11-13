package game.common.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class UdpNetworkElement extends NetworkElement {
	private DatagramSocket mySocket;
	
	UdpNetworkElement(int port){
		super();
		if(port==0)port=freePort++;
		try{
			mySocket=new DatagramSocket(myPort=port);
		}catch(Exception E){System.out.print("Port unavailable");}
	}

	public void connect(InetAddress ip, int port){
		mySocket.connect(ip, port);
	}
	
	
	
	public void destroy(){
		mySocket.close();
	}
	
	public void send(Packet data){
		
		try {
			mySocket.send(new DatagramPacket(data.writeMe(), 0));
		} catch (IOException e) {e.printStackTrace();}
		
		
	}
	
	public Packet receive(){
		return null;
	}

}
