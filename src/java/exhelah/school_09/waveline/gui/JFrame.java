package exhelah.school_09.waveline.gui;

import exhelah.school_09.waveline.level.KeyBindings;
import exhelah.school_09.waveline.reference.GameInfo;
import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;
import exhelah.school_09.waveline.WaveLine;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFrame {
	final javax.swing.JFrame f;
    public JPanel jPanel;
	int width = 0, height = 0;
	
    public JFrame() throws Exception {
        Images.init();
        f = new javax.swing.JFrame(GameInfo.NAME + " " + GameInfo.VERSION);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                LogHelper.debug(Messages.Gui.WINDOW_CLOSE, 1, "GUI");
                f.setVisible(false);
                WaveLine.terminate();
            }
        });
        f.setIconImage(Images.getImage("debug_icon.png"));
        f.add(jPanel = new JPanel());
        f.setVisible(true);

        LogHelper.debug(Messages.Gui.JFRAME_INIT, 1, "GUI");
    }
    
    public void changeSize(int width, int height) {
    	f.setSize(width, height);
    }

    public void addKeyListener(KeyBindings keyBindings) {
        f.addKeyListener(WaveLine.level.keys);
    }
}
