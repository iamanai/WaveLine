package exhelah.school_09.waveline;

import exhelah.school_09.waveline.gui.JFrame;
import exhelah.school_09.waveline.level.LevelHandler;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

public class WaveLine {
    public static LevelHandler level;
    public static JFrame gui;

	public static void main(String[] args) throws Exception {
        LogHelper.info(Messages.Init.START, "Main");
        LogHelper.debug(Messages.ROOT_FILE_PATH, 2, "Main");
        gui = new JFrame();
        level = new LevelHandler(10);
        level.postInit();
		LogHelper.info(Messages.Init.COMPLETE, "Main");
	}
	
	public static void terminate() {
		LogHelper.info(Messages.Init.SHUTDOWN, "Main");
		System.exit(0);
	}
}
