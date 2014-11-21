package code.exhelah.games.waveline.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;

import code.exhelah.games.waveline.reference.ClassPaths;
import code.exhelah.games.waveline.reference.Colors;
import code.exhelah.games.waveline.reference.GameInfo;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

public class WindowBuilder {
	int width = 0, height = 0;
	
	public WindowBuilder(int width, int height) {
        JFrame f = new JFrame("WaveLine " + GameInfo.VERSION);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.SHUTDOWN);
                System.exit(0);
            }
        });
        f.getContentPane().setBackground(Colors.WINDOW_BACKGROUND);
        f.setSize(width, height);
        f.setVisible(true);
        
        this.width = width;
        this.height = height;
	}
}