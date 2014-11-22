package code.exhelah.games.waveline.reference;

public class Messages {
	public static class Init {
		public static final String START = "Initializing WaveLine " + GameInfo.VERSION;
		public static final String GUI = "Initializing GUIs...";
        public static final String KEY_BINDINGS = "Registering keybindings...";
        public static final String IMAGES = "Registering images...";
        public static final String WINDOW = "Building game window...";
		public static final String COMPLETE = "Initialization Complete!";
        public static final String SHUTDOWN = "Terminating WaveLine " + GameInfo.VERSION;
        
        public static String genComponent(String component) {
        	return "Generating component: " + component;
        }
	}
}
