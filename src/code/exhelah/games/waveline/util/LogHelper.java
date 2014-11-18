package code.exhelah.games.waveline.util;

import java.util.Date;

import code.exhelah.games.waveline.reference.Messages;

public class LogHelper {
	static int debugLog = 0;
	public static String getLogPrefix(String type) {
		return "[WaveLine] [" + getTime() + "] " + type.toUpperCase() + ": ";
	}
	
	private static String getTime() {
		Date date = new Date();
		return date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
	}
}
