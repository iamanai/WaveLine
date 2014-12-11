package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.TreeMap;

public class WaveBlocker implements JPanel.GraphicsUpdate {
    TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer>();
    int x = 0, y = 0;
    int gridSize = 0, tileSize = 0;

    public WaveBlocker(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        x = levelInfo.get("waveBlockerX");
        y = levelInfo.get("waveBlockerY");
        gridSize = levelInfo.get("gridSize");
        tileSize = levelInfo.get("tileSize");
        LogHelper.debug(Messages.COMPONENT_GEN("WaveBlocker"), 1, "GUI");
    }

    @Override
    public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
        this.levelInfo = levelInfo;
        x = levelInfo.get("waveBlockerX");
        y = levelInfo.get("waveBlockerY");
        g.setColor(Colors.Level.WAVE_BLOCKER);
        g.fillRect(x, y, x + (gridSize * tileSize), y + (gridSize * tileSize));
    }
}
