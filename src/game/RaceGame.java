package game;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import game.client.ClientLevel;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import game.common.engine.Drawable;
import game.common.engine.Updateable;
import game.gui.menus.CreateGameScreen;
import game.gui.menus.ExitGameDialog;
import game.gui.menus.JoinGameScreen;
import game.gui.menus.MainMenu;
import game.gui.menus.Menu;
import game.gui.menus.NetworkMenu;
import game.gui.menus.NewGameMenu;
import game.gui.menus.SettingsScreen;

public class RaceGame {
	private static boolean terminate=false;//flag to keep track if the user hit esc key
	private static long keyTriggered=0l;//cooldown timer for kyeboard presses
	static ClientLevel myLevel=null;//the current level
	static GameState currentState;//the current game state
	/*
	 * The game screens.
	 * ===========================================================
	 */
	private static Menu myCreateGameScreen=new CreateGameScreen();
	private static Menu myExitGameDialog=new ExitGameDialog();
	private static Menu myJoinGameScreen=new JoinGameScreen();
	private static Menu myMainMenu=new MainMenu();
	private static Menu myNetworkMenu=new NetworkMenu();
	private static Menu myNewGameMenu=new NewGameMenu();
	private static Menu mySettingsScreen=new SettingsScreen();
	/*
	 * ===========================================================
	 */

	public static void start() {
		while((!Display.isCloseRequested())&&!terminate) {//if ESCAPE hasn't been hit and the display hasn't been closed otherwise
			glClear(GL_COLOR_BUFFER_BIT);//for each frame clear the screen
			processInput();//read player input
			getUpdate().update();//update the level
			getDraw().render();//then render it
			Display.sync(60);//force the framerate to 60 FPS or thereabouts
			Display.update();//refresh the display
			
		}
		
	}
	
	
	/**
	 * Function used to determine which game state to draw.
	 * @return The game state to be drawn.
	 */
	static Drawable getDraw(){
		switch(currentState){
		case CreateGameScreen:
			return myCreateGameScreen;
		case ExitGameDialog:
			return myExitGameDialog;
		case JoinGameScreen:
			return myJoinGameScreen;
		case MainMenu:
			return myMainMenu;
		case NetworkGameMenu:
			return myNetworkMenu;
		case NewGameMenu:
			return myNewGameMenu;
		case SettingsScreen:
			return mySettingsScreen;
		default:
			return null;
		}
	}
	/**
	 * Function used to determine which game state to update.
	 * @return The game state to be updated.
	 */
	static Updateable getUpdate(){
		switch(currentState){
		case CreateGameScreen:
			return myCreateGameScreen;
		case ExitGameDialog:
			return myExitGameDialog;
		case JoinGameScreen:
			return myJoinGameScreen;
		case MainMenu:
			return myMainMenu;
		case NetworkGameMenu:
			return myNetworkMenu;
		case NewGameMenu:
			return myNewGameMenu;
		case SettingsScreen:
			return mySettingsScreen;
		default:
			return null;
		}
	}

	private static void processInput() {
		if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
			if((((long)System.nanoTime()-keyTriggered)>150000000)){//if time passed
				keyTriggered=System.nanoTime();
				terminate=!terminate;
			}
		}
		
	}


	public static void updateInGameSettings() {
		// TODO Auto-generated method stub
		
	}


	public static void setCurrentGameState(GameState g) {
		currentState=g;
		
	}


	public static void setTerminate(boolean b) {
		terminate=b;
		
	}

}
