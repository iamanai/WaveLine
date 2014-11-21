package code.exhelah.games.waveline.gui.components;

import java.awt.Color;

import code.exhelah.games.waveline.reference.Colors;
import code.exhelah.games.waveline.reference.LevelCoords;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class Line {
	Color color = Colors.LEVEL_LINE;
	int x1 = 0, x2 = 0, y = 0;
	
	public Line() {
		System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.genComponent("Line"));
		// Get initial coordinates
		x1 = LevelCoords.LINE_START_X;
		y = LevelCoords.LINE_START_Y;
		x2 = x1 + (LevelCoords.LEVEL_UNIT_SIZE * LevelCoords.LEVEL_GRID_SIZE);
		
		// 
	}
	
}