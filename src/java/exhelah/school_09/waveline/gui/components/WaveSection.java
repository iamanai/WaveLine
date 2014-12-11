package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.TreeMap;

public class WaveSection implements JPanel.GraphicsUpdate {
	Polygon lower = new Polygon(), higher = new Polygon();
	TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer> ();
	int levelIndex = 0;
	int size = 0;
    int levelBottom = 0;
	Color higherColor = Colors.Level.WAVE_SECTION_HIGHER, lowerColor = Colors.Level.WAVE_SECTION_LOWER;
	
	public WaveSection(int levelIndex, TreeMap<String, Integer> levelInfo) { // Constructor
        this.levelInfo = levelInfo;
        this.levelIndex = levelIndex;
		size = levelInfo.get("tileSize");
        levelBottom = levelInfo.get("tileSize") * levelInfo.get("gridSize");

        LogHelper.debug(Messages.COMPONENT_GEN("WaveSection_" + levelIndex), 1, "GUI");
	}

	@Override
	public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
		this.levelInfo = levelInfo;
		updatePosition(levelInfo.get("waveSection" + levelIndex + "X"), levelInfo.get("waveSection" + levelIndex + "Y"));
		g.setColor(higherColor);
		g.fillPolygon(higher);
		g.setColor(lowerColor);
		g.fillPolygon(lower);
	}
	
	private void updatePosition(int x, int y) {
		lower.reset();
		higher.reset();
		
		lower.addPoint(x, y + size);
        lower.addPoint(x + size, y + size);
        lower.addPoint(x + size, y + (size * 3));
        lower.addPoint(x, y + (size * 3));
        
        higher.addPoint(x, y);
        higher.addPoint(x + size, y);
        higher.addPoint(x + size, y + size);
        higher.addPoint(x, y + size);
	}
}
