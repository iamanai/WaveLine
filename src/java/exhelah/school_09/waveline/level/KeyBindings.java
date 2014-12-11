package exhelah.school_09.waveline.level;

import exhelah.school_09.waveline.reference.Messages;
import exhelah.school_09.waveline.util.LogHelper;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class KeyBindings extends KeyAdapter {
    LinkedList<String> keyBindingValues;
    LinkedList<KeyListener> keyListeners;

    public KeyBindings() {
        keyBindingValues = new LinkedList<String>();
        keyListeners = new LinkedList<KeyListener>();
        LogHelper.debug(Messages.Level.KEYS_INIT, 1, "Level");
    }

    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case KeyEvent.VK_SPACE:
                for (KeyListener sl : keyListeners) {
                    sl.keyPressed("space");
                }
                break;
            case KeyEvent.VK_0:
                for (KeyListener sl : keyListeners) {
                    sl.keyPressed("0");
                }
        }
    }

    public void addKeyListener(KeyListener o) {
        keyListeners.add(o);
    }

    public interface KeyListener {
        public void keyPressed(String key);
    }
}
