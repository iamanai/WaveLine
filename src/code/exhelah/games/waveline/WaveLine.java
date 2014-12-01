/* NOTES:
 * On-screen GUI still doesn't work with polygons - WindowBuilder makes a whole new GuiHandler when initialized, so the polygons list is emptied again
 * To disable the "debug" log outputs, head to GameInfo and set LOG_DEBUG_MESSAGES to false
 */

package code.exhelah.games.waveline;

import code.exhelah.games.waveline.gui.GuiHandler;
import code.exhelah.games.waveline.level.KeyBindings;
import code.exhelah.games.waveline.reference.Messages;
import code.exhelah.games.waveline.util.LogHelper;

import java.io.IOException;

public class WaveLine {
	public static void main(String[] args) throws IOException {
        LogHelper.info(Messages.Init.START);
        LogHelper.debug(Messages.ROOT_FILE_PATH);
		
		GuiHandler.init();
		KeyBindings.init();

		LogHelper.info(Messages.Init.COMPLETE);
	}
}
