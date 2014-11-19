package code.exhelah.games.waveline.init;

import code.exhelah.games.waveline.gui.GuiHandler;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class GameInit {
	public static void init() {
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.START);
		GuiHandler.init();
	}
}
