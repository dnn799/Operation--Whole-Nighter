package game.common.network;

import game.common.GameObject;

public class GameStatePacket extends Packet {
	private GameObject myGameObjectInfo[];
	private int numOfGameObjects;
	
	GameStatePacket(){super(); numOfGameObjects=0;}
	
	public void add(GameObject O){myGameObjectInfo[numOfGameObjects++]=O;}
	public GameObject get(){return myGameObjectInfo[numOfGameObjects--];}

}
