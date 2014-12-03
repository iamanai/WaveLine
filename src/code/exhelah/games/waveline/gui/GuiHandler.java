package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.gui.components.Line;
import code.exhelah.games.waveline.gui.components.wavesection.WaveSection_Lower;
import code.exhelah.games.waveline.gui.components.wavesection.WaveSection_Upper;
import code.exhelah.games.waveline.reference.LevelCoords;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;

public class GuiHandler {
    static LinkedList<Polygon> polygons = new LinkedList<Polygon> ();
    
	public static void init() throws Exception {
        LogHelper.debug(Messages.Init.GUI, 1, "GUI");
        Images.init();
        WindowBuilder window = new WindowBuilder(600, 400);
        polygons.add(new WaveSection_Lower(LevelCoords.WAVE_SECTION_START_X, LevelCoords.WAVE_SECTION_START_Y, 50).returnPolygon());
        polygons.add(new Line().returnPolygon());
    }
	
	public void refresh() {
		polygons.clear();
	}
	
	public static LinkedList<Polygon> getPolygons() {
		return polygons;
	}
}
