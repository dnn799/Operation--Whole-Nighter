package game.common.engine;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;


public class Engine {
	/** static display mode object that gets the display
	* from user OS and lives as long as the game 
	*/
	public static DisplayMode disp_mode=null;
	/**initialisation of the game window, parameters can be changed
	 * 
	 */
	public static void init() { 
		try {			
			//Display.setDisplayMode(getDisplayModeFromFile());
			disp_mode=Display.getDesktopDisplayMode();
			Display.setDisplayMode(disp_mode);
			Display.setFullscreen(true);
			Display.create();//init Display object
			Display.setVSyncEnabled(true);//your framerate -> display max framerate
			
			/* init GL */
			
			glMatrixMode(GL_PROJECTION);//gl projection matrix selected
			glLoadIdentity();//put the initial matrix to be identity matrix
			glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);
			glMatrixMode(GL_MODELVIEW);//set matrix mode to GL_MODELVIEW
			glClearColor(0, 0, 0, 1);//black background
			glDisable(GL_DEPTH_TEST);//disable the depth test, working 2D not 3D
			glClear(GL_COLOR_BUFFER_BIT);//wipe random color traces from buffer
			glColor3f(0.25f, 0.75f, 0.5f);//set drawing colof
			
			
			/* 
			 *here defined mouse and keyboard init code but not used right now
			 */
			//Mouse.create();
			//Keyboard.create();
			
		}catch(LWJGLException e){
			e.printStackTrace();
			}
	}
	
	public static void kill(){
		Display.destroy();
		//Mouse.destroy(); // kill the mouse
		//Keyboard.destroy(); // kill the keyboard
	}
	
	/** i like this function :)
	 * but i think we will not use it in full screen mode
	 */
	
	
	private static DisplayMode getDisplayModeFromFile() throws LWJGLException{
		Scanner s = null;
		int targetWidth;
		int targetHeight;
		try {
			s = new Scanner(new BufferedReader(new FileReader("Settings.ini")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!s.next().contentEquals("Resolution="));
		while(!s.hasNextInt()){
			s.next();
		}
		targetWidth=s.nextInt();
		while(!s.hasNextInt()){
			s.next();
		}
		targetHeight=s.nextInt();
		s.close();
		//TODO add if fullscreen check here
		DisplayMode [] available=Display.getAvailableDisplayModes();
		for(DisplayMode d:available){
			if(d.getWidth()==targetWidth && d.getHeight()==targetHeight){//TODO add refreshrate check
				return d;
			}
		}
		return new DisplayMode(800,600);
		
		
		
		
	}
}
