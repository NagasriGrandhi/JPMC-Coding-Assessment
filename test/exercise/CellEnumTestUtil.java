package exercise;

import com.jpmc.code.exercise.CellEnum;

public class CellEnumTestUtil {
    public static CellEnum[][] createInputGrid() {
        String[] strGrid = {"......O.",
                "OOO...O.",
                "......O.",
                "........",
                "...OO...",
                "...OO..."};
        CellEnum[][] inputGrid = convertIntoCellEnum(strGrid);
        return  inputGrid;
    }

    private static CellEnum[][] convertIntoCellEnum(String[] strGrid) {
        int rows = strGrid.length;
        int columns = strGrid[0].length();
        CellEnum[][] inputGrid = new CellEnum[rows][columns];
        for(int i=0; i<rows; i++) {
            char[] chars = strGrid[i].toCharArray();
            for(int j=0; j<columns; j++) {
                inputGrid[i][j] = CellEnum.getCellEnum(chars[j]);
            }

        }
        return inputGrid;
    }
    public static CellEnum[][] getExpectedGrid() {
        String[] strGrid = {".O......",
                ".O...OOO",
                ".O......",
                "........",
                "...OO...",
                "...OO..."};
        CellEnum[][] outputGrid = convertIntoCellEnum(strGrid);
        return outputGrid;
    }
}
