package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.gui.components.Line;
import code.exhelah.games.waveline.gui.components.WaveSection;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.*;
import java.io.IOException;

public class GuiHandler {
	public static void init() throws IOException {
        System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.GUI);
        Images.init();
        WindowBuilder window = new WindowBuilder(600, 400);
        Line line = new Line();
        WaveSection wave1 = new WaveSection(50, 50, 50);
    }

    public static void paint(Graphics g) {

    }
}
