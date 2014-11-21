package code.exhelah.games.waveline;

import code.exhelah.games.waveline.gui.GuiHandler;
<<<<<<< HEAD
import code.exhelah.games.waveline.level.KeyBindings;
=======
>>>>>>> origin/master
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class WaveLine {
	public static void main(String[] args) {
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.START);
		
		GuiHandler.init();
<<<<<<< HEAD
		KeyBindings.init();
=======
>>>>>>> origin/master
		
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.COMPLETE);
	}
}
