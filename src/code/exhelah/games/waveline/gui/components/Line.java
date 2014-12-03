package code.exhelah.games.waveline.gui.components;

import java.awt.*;

import code.exhelah.games.waveline.reference.Colors;
import code.exhelah.games.waveline.reference.LevelCoords;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class Line {
	Color color = Colors.Level.LEVEL_LINE;
    static Polygon polygon = new Polygon();
	int x1 = 0, x2 = 0, y = 0;
	
	public Line() {
		LogHelper.debug(Messages.Init.genComponent("Line"), 2, "GUI");
		// Get initial coordinates
		polygon.addPoint(LevelCoords.LEVEL_START_X, LevelCoords.LEVEL_START_Y);
        polygon.addPoint(LevelCoords.LEVEL_START_X + (LevelCoords.LEVEL_GRID_SIZE * LevelCoords.LEVEL_UNIT_SIZE), LevelCoords.LEVEL_START_Y);
        polygon.addPoint(LevelCoords.LEVEL_START_X + (LevelCoords.LEVEL_GRID_SIZE * LevelCoords.LEVEL_UNIT_SIZE), LevelCoords.LEVEL_START_Y + 3);
        polygon.addPoint(LevelCoords.LEVEL_START_X, LevelCoords.LEVEL_START_Y + 3);

	}

    public Polygon returnPolygon() {
        return polygon;
    }
}