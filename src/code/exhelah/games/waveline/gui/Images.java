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

    public static void init() throws IOException {
        System.out.println(LogHelper.getLogPrefix("debug") + Messages.Init.IMAGES);
        System.out.println(LogHelper.getLogPrefix("debug") + "Root file path: " + ClassPaths.ROOT_FILE_PATH);
        try {
            addImage(ClassPaths.Assets.WINDOW_DEBUG_ICON, "debug_icon.png");
        } catch (IOException e) {
            throw new IOException("Image file does not exist");
        }
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

    private static void addImage(String filePath, String fileName) throws IOException {
        images.add(ImageIO.read(new File(ClassPaths.Assets.WINDOW_DEBUG_ICON)));
        imageNames.add(fileName);
    }
}
