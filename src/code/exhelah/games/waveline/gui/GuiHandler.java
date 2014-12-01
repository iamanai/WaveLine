package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.gui.components.Line;
import code.exhelah.games.waveline.gui.components.WaveSection;
import code.exhelah.games.waveline.reference.Colors;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;

public class GuiHandler extends JPanel {
    static LinkedList<Polygon> polygons = new LinkedList<Polygon> ();

	public static void init() throws IOException {
        LogHelper.debug(Messages.Init.GUI);
        Images.init();
        WindowBuilder window = new WindowBuilder(600, 400);
        // polygons.add(new WaveSection(50, 50, 50).returnPolygon());
    }

    @Override
    public void paint(Graphics g) {
        // TEMPORARY: ------------------------
        g.setColor(Colors.WAVE_SECTION_HIGHER);
        g.fillRect(50, 50, 50, 50);
        g.setColor(Colors.WAVE_SECTION_LOWER);
        g.fillRect(50, 100, 50, 100);
        g.setColor(new Color(0, 0, 0));
        g.drawString("This is not a polygon object! D:", 150, 100);
        // ---------------------

        for (int i = 0; i < polygons.size(); i++) g.fillPolygon(polygons.get(i));
    }
}
