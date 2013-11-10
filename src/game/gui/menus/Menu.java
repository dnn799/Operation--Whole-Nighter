package game.gui.menus;

import game.common.engine.DrawObject;
import game.common.engine.Drawable;
import game.common.engine.Updateable;
import game.gui.buttons.Button;
import game.gui.menus.misc.Frame;

import java.util.ArrayList;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;


public abstract class Menu implements Drawable, Updateable{
	protected ArrayList<Button> myButtons;
	protected Texture background;
	protected Frame myFrame;
	private static long menuCalled;
	
	@Override
	public void render() {
		Mouse.setGrabbed(false);
		DrawObject.draw(this);
		myFrame.render();
		for (Button b:myButtons)
			b.render();		
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
			Mouse.next();
		}
		else{
			while(Mouse.next()){
				for(Button b:myButtons){
					b.update();
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
