package code.exhelah.games.waveline.gui.components.wavesection;

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.*;

public class WaveSection_Upper {
    Polygon polygon = new Polygon();
    int x = 0, y = 0, size = 0;

	public WaveSection_Upper(int x1, int y1, int size) {
    	LogHelper.debug(Messages.Init.genComponent("WaveSection"), 2, "GUI");
        x = x1;
        y = y1; 
        polygon.addPoint(x, y);
        polygon.addPoint(x + size, y);
        polygon.addPoint(x + size, y + size);
        polygon.addPoint(x, y + size);
    }

    public Polygon returnPolygon() {
        return polygon;
    }
}
