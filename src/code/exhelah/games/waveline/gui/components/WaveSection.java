package code.exhelah.games.waveline.gui.components;

import javax.swing.*;

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.*;

public class WaveSection {
    Polygon lower = new Polygon(), higher = new Polygon();
    int x = 0, y = 0, size = 0;

	public WaveSection(int x1, int y1, int size) {
    	LogHelper.debug(Messages.Init.genComponent("WaveSection"));
        x = x1;
        y = y1;
        
        getPoints();
    }
	
	public void debugMove() {
		
	}

    public Polygon getHigherPolygon() {
        return higher;
    }

    public Polygon getLowerPolygon() {
        return lower;
    }
    
    private void getPoints() {
    	higher.reset();
    	lower.reset();
    	
    	higher.addPoint(x, y);
        higher.addPoint(x + size, y);
        higher.addPoint(x + size, y + size);
        higher.addPoint(x, y + size);
        
        lower.addPoint(x, y + size);
        lower.addPoint(x + size, y + size);
        lower.addPoint(x + size, y + (size * 2));
        lower.addPoint(x, y + (size * 2));
    }
}
