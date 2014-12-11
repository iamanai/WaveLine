// Level math done by Dustyn, implemented and cleaned up by Caleb

package exhelah.school_09.waveline.level;

import java.util.Random;
import java.util.TreeMap;

public class LevelMath {
	int lineSpeed;
	int gridSize;
	int waveYDifference;
	
	public LevelMath() {
        initialLevelCalc();
	}

    public int getLineSpeed() {
        return lineSpeed;
    }

    public int getGridSize() {
        return gridSize;
    }

    public int getWaveYDifference() {
        return waveYDifference;
    }

    private void initialLevelCalc() {
        gridSize = gridSizeCalc();
        lineSpeed = lineSpeedCalc();
        waveYDifference = waveDifferenceCalc();
    }

    private int lineSpeedCalc(){ // Dustyn
		Random ran = new Random();
        return ran.nextInt((50 - 10) + 1) + 10;
	}
	
	private int gridSizeCalc(){ // Dustyn
		Random ran = new Random();
		return ran.nextInt(3) + 4;
	}
	
	private int waveDifferenceCalc(){ // Dustyn
		Random ran = new Random();
		return ran.nextInt(25) + 10;
	}
}
