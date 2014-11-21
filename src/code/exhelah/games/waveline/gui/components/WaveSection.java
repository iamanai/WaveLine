package code.exhelah.games.waveline.gui.components;

import javax.swing.*;

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaveSection extends JPanel implements ActionListener {
    Timer t = new Timer(7, this);

    public WaveSection() {
    	System.out.println(LogHelper.getLogPrefix("debug") + Messages.genComponent("WaveSection"));
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    }
}
