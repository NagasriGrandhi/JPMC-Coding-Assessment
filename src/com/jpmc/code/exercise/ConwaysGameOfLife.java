package com.jpmc.code.exercise;

import java.util.Arrays;

public class ConwaysGameOfLife {

    /**
     * Finds the next state of the playing field for a given initial grid state
     * @param inputGrid
     */
    public CellEnum[][] findNextState(CellEnum[][] inputGrid) throws NullPointerException {
        if (inputGrid == null) throw new NullPointerException();
        int rows = inputGrid.length;
        int columns = inputGrid[0].length;
        CellEnum[][] outputGrid = new CellEnum[rows][columns];
        for (int i=0;i<rows; i++) {
            for (int j=0; j<columns; j++) {
                CellEnum currentLife = inputGrid[i][j];
                int liveNeighbours = noOfLiveNeighbours(inputGrid, i, j);
                calculateNextState(outputGrid, i, j, currentLife, liveNeighbours);
            }
        }
        return outputGrid;
    }

    /**
     * Calculates the next state of a cell using the current life of the cell and number of live neighbours using
     * the below rules
             1. Any live cell with fewer than two live neighbors dies, as if caused by under- population.
             2. Any live cell with more than three live neighbors dies, as if by overcrowding.
             3. Any live cell with two or three live neighbors lives on to the next generation.
             4. Any dead cell with exactly three live neighbors becomes a live cell.
     * @param outputGrid
     * @param i
     * @param j
     * @param currentLife
     * @param liveNeighbours
     */
    private void calculateNextState(CellEnum[][] outputGrid, int i, int j, CellEnum currentLife, int liveNeighbours) {
        switch (currentLife) {
            case ALIVE:
                switch (liveNeighbours) {
                    case 1:
                        outputGrid[i][j] = CellEnum.DEAD;
                        break;
                    case 2:
                    case 3:
                        outputGrid[i][j] = CellEnum.ALIVE;
                        break;
                    default:
                        outputGrid[i][j] = CellEnum.DEAD;
                }
                break;
            case DEAD:
                switch (liveNeighbours) {
                    case 3:
                        outputGrid[i][j] = CellEnum.ALIVE;
                        break;
                    default:
                        outputGrid[i][j] = CellEnum.DEAD;
                }
                break;
            default:
                    //do nothing
        }
    }

    /**
     * Finds the no of live neighbours for the given coordinate (x,y)
     * The neighbours are determined as per below rule
     *      A cell’s neighbors are those cells which are horizontally, vertically or diagonally adjacent.
     *      Most cells will have eight neighbors. Cells placed on the edge of the grid will have fewer.
     * @param inputGrid
     * @param x
     * @param y
     * @return
     */
    private int noOfLiveNeighbours(CellEnum[][] inputGrid, int x, int y) {
        int rows = inputGrid.length;
        int columns = inputGrid[0].length;
        int alive = 0;
        for (int row=-1;row<=1; row++) {
            for (int column=-1;column<=1; column++) {
                if (row == 0 && column == 0) continue; // Ignore check self
                if ((x+row < 0) || (x+row) >= rows) continue; // row bounds checking
                if ((y+column < 0) || (y+column) >= columns) continue; // column bounds checking
                if (inputGrid[x+row][y+column] == CellEnum.ALIVE){
                    alive++;
                }
            }
        }
        return alive;
    }


}
