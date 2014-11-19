package code.exhelah.games.waveline.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;

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
        f.setVisible(true);
        f.setSize(width, height);
        f.setBackground(Color.BLACK);
        this.width = width;
        this.height = height;
	}
}


/*
	public WindowBuilder(int width, int height) {
		JFrame f = new JFrame("WaveLine " + GameInfo.VERSION); // Creates window with the game's name and current version
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { // When you close the window
				System.out.println(LogHelper.getLogPrefix("info") + Messages.Init.SHUTDOWN); // Log game shutdown
				System.exit(0); // Stop the program
			}
		});
		f.getContentPane().add("Center", this);
		f.pack();
		f.setSize(new Dimension(width, height)); // x,y for the window
		f.setVisible(true); // Shows the window!
	}

	public void paint(Graphics g) {
		GuiHandler.updateGraphics();
	}

*/