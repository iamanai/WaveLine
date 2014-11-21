package code.exhelah.games.waveline.gui;

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
	}
}
