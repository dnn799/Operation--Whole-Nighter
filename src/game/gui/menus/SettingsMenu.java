package game.gui.menus;

import game.gui.buttons.ApplyButton;
import game.gui.buttons.Button;
import game.gui.buttons.CancelButton;
import game.gui.menus.misc.CheckBox;
import game.gui.menus.misc.ColorsBox;
import game.gui.menus.misc.DisplayDropDown;
import game.gui.menus.misc.DropDown;
import game.gui.menus.misc.SettingsFrame;

import java.util.ArrayList;
import org.lwjgl.opengl.Display;

public class SettingsMenu extends Menu {
	@Override
	public void render() {
		myFrame.render();
		for(Button b:myButtons){
			b.render();
		}
		for(CheckBox c:myCheckBoxes){
			c.render();
		}
		for(DropDown d:myDropDowns){
			d.render();
		}
	}

	@Override
	public void update() {
		super.update();
		for(CheckBox c:myCheckBoxes){
			c.update();
		}
		for(DropDown d:myDropDowns){
			d.update();
		}
	}

	ArrayList<CheckBox> myCheckBoxes;
	ArrayList<DropDown> myDropDowns;

	public SettingsMenu() {
		super();
		myButtons=new ArrayList<Button>();
		myCheckBoxes=new ArrayList<CheckBox>();
		myDropDowns=new ArrayList<DropDown>();
		myFrame=new SettingsFrame(
				Display.getWidth()/2,
				Display.getHeight()/2,
				Display.getWidth()/5,
				Display.getHeight()/2
				);
		myButtons.add(new CancelButton(
				Display.getWidth()/2,
				Display.getHeight()/2+Display.getHeight()/30,
				Display.getWidth()/10,
				Display.getHeight()/15)
		);
		myButtons.add(new ApplyButton(
				Display.getWidth()/2,
				Display.getHeight()/2+Display.getHeight()/14+Display.getHeight()/30,
				Display.getWidth()/10,
				Display.getHeight()/15)
		);
		myCheckBoxes.add(new ColorsBox(
				Display.getWidth()/4,
				Display.getHeight()/(1.5f),
				Display.getWidth()/45,
				Display.getHeight()/30)
		);
		myDropDowns.add(new DisplayDropDown(
				Display.getWidth()/4,
				Display.getHeight()/2,
				Display.getWidth()/10,
				Display.getHeight()/30)
		);
	}
	

}
