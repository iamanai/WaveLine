package code.exhelah.games.waveline.gui;

<<<<<<< HEAD
import java.awt.Image;
import java.util.LinkedList;

public class Images {
	LinkedList<Image> images = new LinkedList<Image> ();
	public void init() {
		
	}
	
	public Image getImage() {
		
	}
	
	private Image initImage(String filePath) {
		
=======
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
	public static void load() {
		try {
			BufferedImage img = ImageIO.read(new File("debug_icon.png"));
		} catch(IOException e) {
			
		}
>>>>>>> origin/master
	}
}
