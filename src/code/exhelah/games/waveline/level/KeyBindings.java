package code.exhelah.games.waveline.level;

import java.awt.Component;

import javax.swing.KeyStroke;

public class KeyBindings {
	Object space;
	public static void init() {
		KeyStroke.getKeyStroke("Space");
	}
	
	public Object getSpaceInput() {
		return space;
	}
}
