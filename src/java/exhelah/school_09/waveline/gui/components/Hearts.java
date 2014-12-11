package exhelah.school_09.waveline.gui.components;

import exhelah.school_09.waveline.gui.Images;
import exhelah.school_09.waveline.gui.JPanel;
import exhelah.school_09.waveline.reference.Colors;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.*;
import java.util.LinkedList;
import java.util.TreeMap;

public class Hearts implements JPanel.GraphicsUpdate {
    LinkedList<Image> hearts = new LinkedList<Image>();
    TreeMap<String, Integer> levelInfo = new TreeMap<String, Integer>();
    int x = 0, y = 0, size = 0;

    public Hearts(TreeMap<String, Integer> levelInfo) {
        this.levelInfo = levelInfo;
        x = levelInfo.get("HPBarX");
        y = levelInfo.get("HPBarY");
        size = levelInfo.get("HPBarSize");

        for (int i = 0; i < levelInfo.get("playerHP"); i++) {
            hearts.add(Images.getImage("heart_white.png"));
        }
        LogHelper.debug(Messages.COMPONENT_GEN("Hearts"), 1, "GUI");
    }

    @Override
    public void updateAndRepaint(TreeMap<String, Integer> levelInfo, Graphics g) {
        this.levelInfo = levelInfo;
        hearts.clear();
        for (int i = 0; i < levelInfo.get("playerHP"); i++) {
            hearts.add(Images.getImage("heart.png"));
        }

        int index = 0;
        Graphics2D g2 = (Graphics2D) g;
        for (Image i : hearts) {
            int x = this.x - index * (size + 5);
            g2.drawImage(i, x, y, x + size, y + size, 0, 0, i.getWidth(null), i.getHeight(null), null);
            index++;
        }
    }
}
