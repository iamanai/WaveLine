package code.exhelah.games.waveline.gui.components;

import javax.swing.*;

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.*;

public class WaveSection  {
    static Polygon lower = new Polygon(), higher = new Polygon();
    int x = 0, y = 0, size = 0;

	public WaveSection(int x1, int y1, int size) {
    	System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.genComponent("WaveSection"));
        x = x1;
        y = y1;

        higher.addPoint(x, y1);
        higher.addPoint(x + size, y);
        higher.addPoint(x + size, y + size);
        higher.addPoint(x, y + size);
    }
	
	public void debugMove() {
		
	}

    public static Polygon getHigherPolygon() {
        return higher;
    }

    public static Polygon getLowerPolygon() {
        return lower;
    }
}
