package code.exhelah.games.waveline.gui;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.*;

import code.exhelah.games.waveline.WaveLine;
import code.exhelah.games.waveline.reference.ClassPaths;
import code.exhelah.games.waveline.reference.Colors;
import code.exhelah.games.waveline.reference.GameInfo;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class WindowBuilder extends JPanel {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    JFrame f = new JFrame("WaveLine " + GameInfo.VERSION);
    LinkedList<Polygon> polygons = new LinkedList<Polygon> ();
	int width = 0, height = 0;

    public WindowBuilder(int width, int height) {
        LogHelper.debug(Messages.Init.WINDOW, 1, "GUI");

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                LogHelper.debug(Messages.Gui.WINDOW_CLOSE, 1, "GUI");
                f.setVisible(false);
                WaveLine.terminate();
            }
        });
        f.setIconImage(Images.getImage("debug_icon.png"));
        // f.getContentPane().setBackground(Colors.WINDOW_BACKGROUND);
        f.setSize(width, height);
        f.add(new WindowPainter());
        f.setVisible(true);

        this.width = width;
        this.height = height;
    }
}
