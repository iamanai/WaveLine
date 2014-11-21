package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.gui.components.Line;
<<<<<<< HEAD
import code.exhelah.games.waveline.gui.components.WaveSection;
=======
>>>>>>> origin/master
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class GuiHandler {
	public static void init() {
		System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.GUI);
		WindowBuilder window = new WindowBuilder(600, 400);
		Line line = new Line();
<<<<<<< HEAD
		WaveSection wave1 = new WaveSection();
		// wave1.debugMove();
=======
>>>>>>> origin/master
	}
}
