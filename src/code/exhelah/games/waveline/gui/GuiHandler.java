package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.gui.components.Line;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class GuiHandler {
	public static void init() {
		System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.GUI);
		WindowBuilder window = new WindowBuilder(600, 400);
		Line line = new Line();
	}
}
