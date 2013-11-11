package game.gui.menus;

import game.gui.menus.misc.checkboxes.CheckBox;
import game.gui.menus.misc.checkboxes.ColorsBox;
import game.gui.menus.misc.dropdown.DisplayDropDown;
import game.gui.menus.misc.dropdown.DropDown;
import game.gui.menus.misc.frames.SettingsFrame;
import game.gui.misc.buttons.ApplyButton;
import game.gui.misc.buttons.Button;
import game.gui.misc.buttons.CancelButton;

import java.util.ArrayList;
import org.lwjgl.opengl.Display;

public class SettingsMenu extends Menu {
	ArrayList<CheckBox> myCheckBoxes;
	ArrayList<DropDown> myDropDowns;
	
	
	@Override
	public void render() {//since the settings menu has checkboxes and dropdowns as well as buttons render needs to be changed
		super.render();
		for(CheckBox c:myCheckBoxes){
			c.render();
		}
		for(DropDown d:myDropDowns){
			d.render();
		}
	}

	@Override
	public void update() {//since the settings menu has checkboxes and dropdowns as well as buttons update needs to be changed
		super.update();
		for(CheckBox c:myCheckBoxes){
			c.update();
		}
		for(DropDown d:myDropDowns){
			d.update();
		}
	}

	
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
