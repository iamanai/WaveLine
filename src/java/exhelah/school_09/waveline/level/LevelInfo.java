package exhelah.school_09.waveline.level;

import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.util.TreeMap;

public class LevelInfo {
	static TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer> ();
    LevelMath math = new LevelMath();
	
	public LevelInfo(int level) {
        levelInfo.put("gridSize", math.getGridSize());
        levelInfo.put("waveYDifference", math.getWaveYDifference());
        levelInfo.put("lineSpeed", math.getLineSpeed());
        levelInfo.put("playerHP", 3);
        levelInfo.put("level", level);
        genConstants();


		for (int i = 0; i < levelInfo.get("gridSize"); i++) {
			levelInfo.put("waveSection" + i + "X",
					levelInfo.get("fieldStartX") + (i * levelInfo.get("tileSize")));
			levelInfo.put("waveSection" + i + "Y",
					levelInfo.get("fieldStartY") + levelInfo.get("gridSize") * levelInfo.get("tileSize"));
		}

		LogHelper.debug("levelInfo: " + levelInfo.toString(), 2, "Level");
        LogHelper.debug(Messages.Level.LIST_INIT, 1, "Level");
	}

    private void genConstants() {
        levelInfo.put("fieldStartX", 10);
        levelInfo.put("fieldStartY", 50);
        levelInfo.put("tileSize", 60);
        levelInfo.put("lineStartX", levelInfo.get("fieldStartX"));
        levelInfo.put("lineStartY", levelInfo.get("fieldStartY"));
        levelInfo.put("gridThickness", 3);
        levelInfo.put("windowWidth", levelInfo.get("tileSize") * levelInfo.get("gridSize") + 38);
        levelInfo.put("windowHeight", levelInfo.get("windowWidth") + levelInfo.get("fieldStartY") + 12);
        levelInfo.put("HPBarSize", 30);
        levelInfo.put("HPBarX", levelInfo.get("windowWidth") - levelInfo.get("fieldStartY") - 5);
        levelInfo.put("HPBarY", 10);
        levelInfo.put("textStartX", levelInfo.get("fieldStartX"));
        levelInfo.put("textStartY", 37);
        levelInfo.put("waveBlockerX", levelInfo.get("fieldStartX") - 3);
        levelInfo.put("waveBlockerY", (levelInfo.get("gridSize") * levelInfo.get("tileSize") + levelInfo.get("fieldStartY")) + levelInfo.get("gridThickness") - 1);
        levelInfo.put("textSize", 30);
    }
	
	public void updateItem(String name, Integer o) {
		levelInfo.put(name, o);
	}
	
	public TreeMap<String, Integer> getLevelInfo() {
		return levelInfo;
	}
}
