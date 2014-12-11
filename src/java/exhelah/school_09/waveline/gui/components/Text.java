package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.TreeMap;

public class Text implements JPanel.GraphicsUpdate {
    TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer>();
    int x = 0, y = 0, level = 0, textSize = 0;

    public Text(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        x = levelInfo.get("textStartX");
        y = levelInfo.get("textStartY");
        level = levelInfo.get("level");
        textSize = levelInfo.get("textSize");
        LogHelper.debug(Messages.COMPONENT_GEN("Text"), 1, "GUI");
    }

    @Override
    public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
        this.levelInfo = levelInfo;
        g.setColor(Colors.Level.HEART);
        g.setFont(new Font("TimesRoman", Font.PLAIN, textSize));
        g.drawString("Level " + level, x, y);
    }
}
