package exercise;

import com.jpmc.code.exercise.CellEnum;
import com.jpmc.code.exercise.ConwaysGameOfLife;

import java.util.*;


public class GameOfLifeExecutor {
    public static void main(String[] args) {
        GameOfLifeExecutor golrRunner = new GameOfLifeExecutor();
        System.out.println("Enter t for testing JPMC test input or Enter r for testing random input:(t/r)" );
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "r":
                golrRunner.setRandomGame();
                break;
            case "t":
            case "T":
            default:
                golrRunner.setTestInput();
                break;
        }
        s.close();
    }

    private void setTestInput() {
        System.out.println("Setting the grid size 6 x 8 " );
        CellEnum[][] inputGrid = CellEnumTestUtil.createInputGrid();
        startGame(inputGrid);
    }

    void setRandomGame() {
        System.out.println("Setting the grid size 10 x 20 " );
        CellEnum[][] inputGrid = new CellEnum[10][20];
        createInputGrid2D(inputGrid);
        startGame(inputGrid);
    }
    void startGame(CellEnum[][] inputGrid) {
        ConwaysGameOfLife conwaysGameOfLife = new ConwaysGameOfLife();
        Scanner s = new Scanner(System.in);
        display2D(inputGrid);
        System.out.println("Do you want to see the next state? y/n");
        String ch = s.nextLine();
        while(ch.equals("y") || ch.equals("Y")) {
            inputGrid = conwaysGameOfLife.findNextState(inputGrid);
            display2D(inputGrid);

            System.out.println("Ctrl+Z to stop.");
            try {
                Thread.sleep(100);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("Do you want to see the next state? y/n");
            ch = s.nextLine();
        }
        s.close();
        System.out.println("Game Over");
    }

    void createInputGrid2D(CellEnum[][] arr) {
        Random random = new Random();
        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr[0].length; j++) {
                int r = random.nextInt(2);
                if(r == 1)
                    arr[i][j] = CellEnum.ALIVE;
                else
                    arr[i][j] = CellEnum.DEAD;
            }
        }
    }
    void display2D(CellEnum[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j].getValue());
            System.out.println();
        }
    }
}
