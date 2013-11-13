package game.common.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

import game.common.GameObject;

public class GameStatePacket extends Packet implements Serializable {
	private GameObject myGameObjectInfo[];
	private int numOfGameObjects;
	
	GameStatePacket(){super(); numOfGameObjects=0;}
	
	public void add(GameObject O){myGameObjectInfo[numOfGameObjects++]=O;}
	public GameObject get(){return myGameObjectInfo[numOfGameObjects--];}
	
	
	
	public static Packet readMe(File f){
		GameStatePacket p=null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			p = (GameStatePacket) (ois.readObject());
			ois.close();
		} catch (Exception e) {e.printStackTrace();}
		return p;
	}

}
