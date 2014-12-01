package code.exhelah.games.waveline.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import code.exhelah.games.waveline.WaveLine;
import code.exhelah.games.waveline.reference.GameInfo;
import code.exhelah.games.waveline.reference.Messages;

public class LogHelper {
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

}
