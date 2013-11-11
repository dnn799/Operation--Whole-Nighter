package game.gui.menus;

import game.common.engine.DrawObject;
import game.common.engine.Drawable;
import game.common.engine.Updateable;
import game.gui.menus.misc.frames.Frame;
import game.gui.misc.buttons.Button;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;


public abstract class Menu implements Drawable, Updateable{
	protected ArrayList<Button> myButtons;//The buttons in the menu
	protected Texture background;//The menu background
	protected Frame myFrame;//The menu frame (the thing around the buttons)
	private static long menuCalled;//cooldown timer for menu buttons
	
	@Override
	public void render() {
		Mouse.setGrabbed(false);//show the mouse
		DrawObject.draw(this);//draw the background
		myFrame.render();//draw the frame
		for (Button b:myButtons)
			b.render();//draw the buttons
	}
	@Override
	public Texture getTexture() {
		return background;
	}
	@Override
	public float getCoordX() {
		return (float)Display.getWidth()/2;
	}
	@Override
	public float getDimX() {
		return (float)Display.getWidth();
	}
	@Override
	public float getCoordY() {
		return (float)Display.getHeight()/2;
	}
	@Override
	public float getDimY(){
		return (float)Display.getHeight();
	}
	@Override
	public void update() {
		if(System.nanoTime()<(long)menuCalled+(long)125000000){	
			Mouse.next();//if the cooldown hasn't passed flip to next mouse event.
		}
		else{
			while(Mouse.next()){
				for(Button b:myButtons){
					b.update();//else check if any of the buttons were pressed.
				}
			}
		}
	}
	/**
	 * @return the menuCalled
	 */
	public static long getMenuCalled() {
		return menuCalled;
	}
	/**
	 * @param menuCalled the menuCalled to set
	 */
	public static void setMenuCalled(long menuCalled) {
		Menu.menuCalled = menuCalled;
	}

}
