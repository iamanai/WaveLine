package code.exhelah.games.waveline.gui.components;

import javax.swing.*;
<<<<<<< HEAD
=======

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> origin/master

import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaveSection  {
	
	public WaveSection() {
    	System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.genComponent("WaveSection"));
=======
    public WaveSection() {
    	System.out.println(LogHelper.getLogPrefix("debug") + Messages.genComponent("WaveSection"));
    }
    
    public void actionPerformed(ActionEvent e) {
    	
>>>>>>> origin/master
    }
	
	public void debugMove() {
		
	}
}
