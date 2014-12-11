package exhelah.school_09.waveline.gui;

import exhelah.school_09.waveline.WaveLine;
import exhelah.school_09.waveline.gui.components.*;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.*;

public class JPanel extends javax.swing.JPanel {
    LinkedList<GraphicsUpdate> graphicsObjects = new LinkedList<GraphicsUpdate> ();
    TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer> ();
    public WaveSection ws;
    public Grid grid;
    public Line line;
    public Hearts hearts;
    public Text text;
    public WaveBlocker blocker;

    public JPanel() {
        setBackground(Colors.General.WINDOW_BACKGROUND);
        LogHelper.debug(Messages.Gui.JPANEL_INIT, 2, "GUI");
    }

    public void newLevel(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        initGraphicsObjects();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GraphicsUpdate gu : graphicsObjects) {
        	gu.updateAndRepaint(levelInfo, g);
        }
        LogHelper.debug("Screen has been updated", 3, "GUI");
    }

    private void initGraphicsObjects() {
        graphicsObjects.clear();

        for (int i = 0; i < levelInfo.get("gridSize"); i++) {
            ws = new WaveSection(i, levelInfo);
            graphicsObjects.add(ws);
        }
        grid = new Grid(levelInfo);
        graphicsObjects.add(grid);
        line = new Line(levelInfo);
        graphicsObjects.add(line);
        hearts = new Hearts(levelInfo);
        graphicsObjects.add(hearts);
        text = new Text(levelInfo);
        graphicsObjects.add(text);
        blocker = new WaveBlocker(levelInfo);
        graphicsObjects.add(blocker);

        LogHelper.debug("graphicsObjects: " + graphicsObjects.toString(), 2, "GUI");
    }
    
    public void addObject(GraphicsUpdate o) {
    	graphicsObjects.add(o);
    }

    public void refresh(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        repaint();
        LogHelper.debug("Screen has been called to update", 3, "GUI");
    }
    
    public interface GraphicsUpdate {
    	public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g);
    }
}