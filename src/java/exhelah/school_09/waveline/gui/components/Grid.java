package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.LinkedList;
import java.util.TreeMap;

public class Grid implements JPanel.GraphicsUpdate {
    TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer> ();
    LinkedList<Polygon> polygons = new LinkedList<Polygon>();
    int gridSize = 0, tileSize = 0, lineThickness = 0;

    public Grid(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        gridSize = levelInfo.get("gridSize");
        tileSize = levelInfo.get("tileSize");
        lineThickness = levelInfo.get("gridThickness");

        // Determine positions for each rectangle
        for (int i = 0; i < gridSize * gridSize; i++) {
            Polygon p = new Polygon();
            int x = levelInfo.get("fieldStartX") + ((i % gridSize) * tileSize);
            int y = levelInfo.get("fieldStartY") + (Math.round(i / gridSize) * tileSize);
            p.addPoint(x, y);
            p.addPoint(x + tileSize, y);
            p.addPoint(x + tileSize, y + tileSize);
            p.addPoint(x, y + tileSize);
            polygons.add(p);
        }

        LogHelper.debug(Messages.COMPONENT_GEN("Grid"), 1, "GUI");
    }

    @Override
    public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
        this.levelInfo = levelInfo;
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(lineThickness));
        g2.setColor(Colors.Level.GRID);
        for (Polygon p : polygons) {
            g2.drawPolygon(p);
        }
    }
}
