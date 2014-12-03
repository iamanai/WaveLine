package code.exhelah.games.waveline.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import code.exhelah.games.waveline.reference.GameInfo;

public class LogHelper {
	public static void info(String message) {
        System.out.println(getLogPrefix("info") + message);
    }

    public static void info(String message, String thread) { System.out.println(getLogPrefix("info", thread) + message); }

    public static void debug(String message, int level) {
        if (GameInfo.DEBUG_LOG_LEVEL >= level) {
            System.out.println(getLogPrefix("debug") + message);
        }
    }

    public static void debug(String message,int level, String thread) {
        if (GameInfo.DEBUG_LOG_LEVEL >= level) {
            System.out.println(getLogPrefix("debug", thread) + message);
        }
    }

	private static String getLogPrefix(String type) {
		return "[" + getTime() + "] [" + GameInfo.NAME + "] " + type.toUpperCase() + ": ";
	}

    private static String getLogPrefix(String type, String thread) {
        return "[" + getTime() + "] ["  + GameInfo.NAME + "/" + thread + "] " + type.toUpperCase() + ": ";
    }
	
	private static String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}





/*
    public static void info(String message) {
        System.out.println(getLogPrefix("info") + message);
    }

    public static void debug(String message) {
        if (GameInfo.LOG_DEBUG_MESSAGES == true) {
            System.out.println(getLogPrefix("debug") + message);
        }
    }

	private static String getLogPrefix(String type) {
		return "[" + getTime() + "] [WaveLine] " + type.toUpperCase() + ": ";
	}
	
	private static String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

*/