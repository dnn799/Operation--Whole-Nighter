package game.common.network;

import java.io.*;

public abstract class Packet implements Serializable {
	
	private int myPort;
	private long timeStamp;

	Packet(){setTime();}
	
	private void setTime(){timeStamp=System.currentTimeMillis();}
	
	public long getTime(){return timeStamp;}
	
	public byte[] writeMe(){
		
		try {
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream oout = new ObjectOutputStream(out);
			
			oout.writeObject(this);
			
			return out.toByteArray();
		
		} catch (Exception e) {e.printStackTrace();}
		
		return null;
	}
	

}
