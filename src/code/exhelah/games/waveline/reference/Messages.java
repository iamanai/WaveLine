package code.exhelah.games.waveline.reference;

public class Messages {
	public static class Init {
		public static final String START = "Initializing " + GameInfo.NAME + " " + GameInfo.VERSION;
		public static final String GUI = "Initializing GUIs...";
		public static final String LEVEL_HANDLER = "Initializing level handler...";
        public static final String KEY_BINDINGS = "Registering keybindings...";
        public static final String IMAGES = "Registering images...";
        public static final String WINDOW = "Building game window...";
		public static final String COMPLETE = "Initialization Complete!";
        public static final String SHUTDOWN = "Terminating " + GameInfo.NAME + " " + GameInfo.VERSION;
        public static String genComponent(String component) {
        	return "Generating component: " + component;
        }
	}
	
	public static class Gui {
		public static String IMAGE_REGISTERED(String imageName, String filePath) {
			return "Image registered: " + imageName + " (" + filePath + ")";
		}
		public static String IMAGE_FILE_NOT_FOUND(String filePath) {
			return "Could not find image file: " + filePath;
		}
		
		public static final String WINDOW_CLOSE = "Terminating game window...";
	}
    public static final String ROOT_FILE_PATH = "Root file path: " + ClassPaths.ROOT_FILE_PATH;
}
