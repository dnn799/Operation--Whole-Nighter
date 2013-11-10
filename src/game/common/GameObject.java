package game.common;

import game.common.engine.Drawable;

import org.newdawn.slick.opengl.Texture;

public abstract class GameObject implements Drawable{
	GameObjectValues myStats;
	private Texture texture=null;
	/**
	 * @return the texture
	 */
	public Texture getTexture() {
		return texture;
	}
	/**
	 * @param texture the texture to set
	 */
	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	/**
	 * @return the coordX
	 */
	public float getCoordX() {
		return myStats.coordX.get();
	}
	/**
	 * @param coordX the coordX to set
	 */
	public void setCoordX(float coordX) {
		this.myStats.coordX.set(coordX);
	}
	/**
	 * @return the coordY
	 */
	public float getCoordY() {
		return myStats.coordY.get();
	}
	/**
	 * @param coordY the coordY to set
	 */
	public void setCoordY(float coordY) {
		this.myStats.coordY.set(coordY);
	}
	/**
	 * @return the dimY
	 */
	public float getDimY() {
		return myStats.dimY.get();
	}
	/**
	 * @param dimY the dimY to set
	 */
	public void setDimY(float dimY) {
		this.myStats.dimY.set(dimY);
	}
	/**
	 * @return the dimX
	 */
	public float getDimX() {
		return myStats.dimX.get();
	}
	/**
	 * @param dimX the dimX to set
	 */
	public void setDimX(float dimX) {
		this.myStats.dimX.set(dimX);
	}

}
