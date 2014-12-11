package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.TreeMap;

public class Line implements JPanel.GraphicsUpdate {
	TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer>();
	int tileSize = 0, gridSize = 0;
	int staX = 0, staY = 0;
	
	public Line(TreeMap<String, Integer> levelInfo) {
		this.levelInfo = levelInfo;
		tileSize = levelInfo.get("tileSize");
		gridSize = levelInfo.get("gridSize");
		staX = levelInfo.get("lineStartX");
		staY = levelInfo.get("lineStartY");
		LogHelper.debug(Messages.COMPONENT_GEN("Line"), 1, "GUI");
	}

	@Override
	public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
		this.levelInfo = levelInfo;
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Colors.Level.LEVEL_LINE);
        g2.drawLine(staX, staY, staX + (tileSize * gridSize), staY);
	}
}
