package code.exhelah.games.waveline.level;

import java.awt.Component;

import javax.swing.KeyStroke;

public class KeyBindings {
	public void init() {
		keyBindings.getInputMap().put(KeyStroke.getKeyStroke("Space"),
			"spacePressed");
	}
}
