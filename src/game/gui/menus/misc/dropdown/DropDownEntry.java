package game.gui.menus.misc.dropdown;

import game.gui.misc.buttons.Button;

import org.newdawn.slick.opengl.Texture;



public abstract class DropDownEntry extends Button {

	@Override
	public Texture getTexture() {
		return myTexture;
	}

	public DropDownEntry(float coordX, float coordY, float dimX, float dimY) {
		super(coordX, coordY, dimX, dimY);
		// TODO Auto-generated constructor stub
	}

	

}
