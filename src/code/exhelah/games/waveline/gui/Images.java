package code.exhelah.games.waveline.gui;

import code.exhelah.games.waveline.reference.ClassPaths;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Images {
    static LinkedList<Image> images = new LinkedList<Image> ();
    static LinkedList<String> imageNames = new LinkedList<String> ();

    public static void init() throws Exception {
        LogHelper.debug(Messages.Init.IMAGES, 1, "GUI");
        
        addImage(ClassPaths.Assets.WINDOW_DEBUG_ICON, "debug_icon.png");
        addImage(ClassPaths.Assets.LEVEL_WAVE_SECTION, "wave_section.png");
    }

	public static Image getImage(String fileName) {
        int index = 0;
		for (int i = 0; i < images.size(); i++) {
            if (imageNames.get(i).equals(fileName)) {
                index = i;
            }
        }
        return images.get(index);
	}

    private static void addImage(String filePath, String fileName) throws Exception {
        try {
        	images.add(ImageIO.read(new File(ClassPaths.Assets.WINDOW_DEBUG_ICON)));
        	imageNames.add(fileName);
            LogHelper.debug(Messages.Gui.IMAGE_REGISTERED(fileName, filePath), 2, "GUI");
        } catch (IOException e) {
        	throw new IndexOutOfBoundsException(Messages.Gui.IMAGE_FILE_NOT_FOUND(filePath));
        }
        
    }
}
