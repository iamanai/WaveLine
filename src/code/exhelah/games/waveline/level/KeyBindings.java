package code.exhelah.games.waveline.level;

import java.awt.Component;

import javax.swing.KeyStroke;

public class KeyBindings {
<<<<<<< HEAD
	Object space;
	public static void init() {
		KeyStroke.getKeyStroke("Space");
	}
	
	public Object getSpaceInput() {
		return space;
=======
	public void init() {
		keyBindings.getInputMap().put(KeyStroke.getKeyStroke("Space"),
			"spacePressed");
>>>>>>> origin/master
	}
}
