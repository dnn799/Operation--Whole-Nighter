package game.gui.misc.buttons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.newdawn.slick.opengl.TextureLoader;


public class ScoresButton extends Button {

	
	public ScoresButton(float coordX, float coordY, float dimX, float dimY) {
		super(coordX, coordY, dimX, dimY);
		try {
			myTexture=TextureLoader.getTexture("PNG", new FileInputStream(new File("res/scoresButton.png")));
			pressedTexture=TextureLoader.getTexture("PNG", new FileInputStream(new File("res/scoresButton.png")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void pressed() {
		//RaceGame.setCurrentGameState(3);//TODO what do we do here?!?!?!?!?
		
	}
}
