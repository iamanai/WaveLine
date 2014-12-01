package code.exhelah.games.waveline.gui;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

import javax.swing.*;

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
        LogHelper.debug(Messages.Init.WINDOW);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                LogHelper.info(Messages.Init.SHUTDOWN);
                System.exit(0);
            }
        });
        f.setIconImage(Images.getImage("debug_icon.png"));
        // f.getContentPane().setBackground(Colors.WINDOW_BACKGROUND);
        f.setSize(width, height);
        f.add(new GuiHandler());
        f.setVisible(true);

        this.width = width;
        this.height = height;
    }
}


/*
public WindowBuilder(int width, int height) {
		JFrame f = new JFrame("WaveLine " + GameInfo.VERSION);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {System.exit(0);} // When you close the window, stop the program!
		});
		f.getContentPane().add("Center", this);
		f.pack();
		f.setSize(new Dimension(width, height)); // x,y for the window

		f.setVisible(true); // Shows the window!
		f.setIconImage(Images.getImage("debug_icon.png"));
		f.setBackground(Colors.WINDOW_BACKGROUND);
		this.width = width;
		this.height = height;
	}

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        System.out.println(polygons.size());
        for (int i = 0; i < polygons.size(); i++) {
            g2d.fillPolygon(polygons.get(i));
        }
    }

    public void addPolygon(Polygon p) {
        polygons.add(p);
        repaint();
    }
*/
