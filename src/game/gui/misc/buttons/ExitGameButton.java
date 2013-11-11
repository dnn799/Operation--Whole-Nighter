package game.gui.misc.buttons;

import game.RaceGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.newdawn.slick.opengl.TextureLoader;


public class ExitGameButton extends Button {

	public ExitGameButton(float coordX, float coordY, float dimX, float dimY) {
		super(coordX, coordY, dimX, dimY);
		try {
			myTexture=TextureLoader.getTexture("PNG", new FileInputStream(new File("res/exitGameButton.png")));
			pressedTexture=TextureLoader.getTexture("PNG", new FileInputStream(new File("res/exitGameButton.png")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void pressed() {
		RaceGame.setTerminate(true);
	}

}
