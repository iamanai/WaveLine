package exhelah.school_09.waveline.reference;

public class Messages {
    public static String COMPONENT_GEN(String component) {
        return "Graphical component generated: " + component;
    }

    public static final String ROOT_FILE_PATH = "Root file path: " + System.getProperty("user.dir");

	public static class Init {
		public static final String START = "Initializing " + GameInfo.NAME + " " + GameInfo.VERSION;
		public static final String COMPLETE = "Initialization Complete!";
        public static final String SHUTDOWN = "Terminating " + GameInfo.NAME + " " + GameInfo.VERSION;
	}
	
	public static class Gui {
		public static String IMAGE_REGISTERED(String imageName, String filePath) {
			return "Image registered: " + imageName + " (" + filePath + ")";
		}
		public static String IMAGE_FILE_NOT_FOUND(String filePath) {
			return "Could not find image file: " + filePath;
		}

        public static final String JPANEL_INIT = "JPanel initialized";
        public static final String JFRAME_INIT = "JFrame initialized";
		public static final String WINDOW_CLOSE = "JFrame terminated";
	}

    public static class Level {
        public static String KEYS_INIT = "Keybindings initialized";
        public static final String LIST_INIT = "Level information list initialized";
    }
}
