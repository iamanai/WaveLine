package code.exhelah.games.waveline.level;

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.Component;

import javax.swing.KeyStroke;

public class KeyBindings {
	Object space;
	public static void init() {
		LogHelper.debug(Messages.Init.KEY_BINDINGS, 1, "Level");
        KeyStroke.getKeyStroke("Space");
	}

	public Object getSpaceInput() {
		return space;
	}
}
