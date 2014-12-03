package code.exhelah.games.waveline.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.util.LinkedList;

import javax.swing.JPanel;

public class WindowPainter extends JPanel {
	LinkedList<Polygon> polygons = new LinkedList<Polygon> ();
	
	public WindowPainter() {
		polygons = GuiHandler.getPolygons();
	}

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) g.fillPolygon(polygons.get(i));
    }
    
    public void refresh() {
    	polygons = GuiHandler.getPolygons();
    	repaint();
    }
}
