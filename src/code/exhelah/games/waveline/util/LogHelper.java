package code.exhelah.games.waveline.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import code.exhelah.games.waveline.reference.Messages;

public class LogHelper {
	public static String getLogPrefix(String type) {
		return "[WaveLine] [" + getTime() + "] " + type.toUpperCase() + ": ";
	}
	
	private static String getTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
