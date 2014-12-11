package exhelah.school_09.waveline.level;

import exhelah.school_09.waveline.WaveLine;
import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.util.LogHelper;

import java.util.TreeMap;

public class LevelHandler implements KeyBindings.KeyListener {
	public LevelInfo infoHandler;
    public KeyBindings keys;
    public JPanel gui;
    String event = "startup";

    public LevelHandler(int level) {
        gui = WaveLine.gui.jPanel;
        keys = new KeyBindings();
        infoHandler = new LevelInfo(level);
        keys.addKeyListener(this);
    }

    public void testMove() {
        infoHandler.updateItem("waveSection0Y", getLevelInfo().get("waveSection0Y") - getLevelInfo().get("waveYDifference"));
        gui.refresh(getLevelInfo());
    }
	
	public TreeMap<String, Integer> getLevelInfo() {
		return infoHandler.getLevelInfo();
	}
	
	public void postInit() {
		WaveLine.gui.changeSize(infoHandler.getLevelInfo().get("windowWidth"), infoHandler.getLevelInfo().get("windowHeight"));
        WaveLine.gui.addKeyListener(keys);
        gui.newLevel(getLevelInfo());
	}

    @Override
    public void keyPressed(String key) {
        if (key.equals("space")) {
            if (event.equals("waiting")) {
                event = "lineDrop";
                lineDrop();
            } else if (event.equals("lineDrop")) {
                event = "waveGen";
                waveGen();
            }
        } else if (key.equals("0")) {
            testMove();
        }
    }

    private void waveGen() {

    }

    private void lineDrop() {

    }
}
