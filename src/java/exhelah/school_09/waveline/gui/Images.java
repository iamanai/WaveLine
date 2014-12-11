package exhelah.school_09.waveline.gui;

import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class Images {
    static TreeMap<String, Image> images = new TreeMap<String, Image> ();
    static String rootPath = System.getProperty("user.dir");

    public static void init() throws Exception {
        addImage(rootPath + "\\src\\resources\\assets\\icons\\debug_icon.png", "debug_icon.png");
        addImage(rootPath + "\\src\\resources\\assets\\level\\wave_section.png", "wave_section.png");
        addImage(rootPath + "\\src\\resources\\assets\\level\\heart.png", "heart.png");
    }

	public static Image getImage(String fileName) {
        return images.get(fileName);
	}

    private static void addImage(String filePath, String fileName) throws Exception {
        try {
        	images.put(fileName, ImageIO.read(new File(filePath)));
            LogHelper.debug(Messages.Gui.IMAGE_REGISTERED(fileName, filePath), 1, "GUI");
        } catch (IOException e) {
        	throw new IndexOutOfBoundsException(Messages.Gui.IMAGE_FILE_NOT_FOUND(filePath));
        }
        
    }
}
