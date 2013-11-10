package game.gui.menus.misc;


import game.common.engine.DrawObject;
import game.common.engine.Drawable;
import org.newdawn.slick.opengl.Texture;

public abstract class Frame implements Drawable {
	protected Texture frame;
	private float coordX;
	private float coordY;
	private float dimX;
	public Frame(float coordX, float coordY, float dimX, float dimY) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.dimX = dimX;
		this.dimY = dimY;
	}

	private float dimY;
	@Override
	public void render() {
		DrawObject.draw(this);
	}

	@Override
	public Texture getTexture() {
		return frame;
	}

	@Override
	public float getCoordX() {
		return coordX;
	}

	@Override
	public float getDimX() {
		return dimX;
	}

	@Override
	public float getCoordY() {
		return coordY;
	}

	@Override
	public float getDimY() {
		return dimY;
	}

}
