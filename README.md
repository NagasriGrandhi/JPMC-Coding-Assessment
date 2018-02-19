# JPMC-Coding-Assessment
The goal of this exercise is to calculate the next generation of Conway’s game of life given any initial state.

This exercise can be tested in two ways.
1) Open the repository in IntelliJ and run the test cases in the test class TestConwaysGameOfLife.java. 
   Also run the GameOfLifeExecutor.java file which would give the same output options as described in 2. 
2) This repository has executable jar file 'JPMC-Coding-Assessment.jar', which can be executed using the below command.
   java -jar JPMC-Coding-Assessment.jar
   This runs class GameOfLifeExecutor which gives two options to test 
    - Using the sample input grid given in JPMC exercise
    - Using the grid of 10 X 20 with values generated randomly.
    
   For example, the console output would be as below. </br>
   Enter t for testing JPMC test input or Enter r for testing random input:(t/r) </br>
    t </br>
    Setting the grid size 6 x 8 </br>
    ......O. </br>
    OOO...O. </br>
    ......O. </br>
    ........ </br>
    ...OO... </br>
    ...OO... </br>
    Do you want to see the next state? y/n </br>
    y </br>
    .O...... </br>
    .O...OOO </br>
    .O...... </br>
    ........ </br>
    ...OO... </br>
    ...OO... </br>
    
    Enter t for testing JPMC test input or Enter r for testing random input:(t/r) </br>
    r </br>
    Setting the grid size 10 x 20 </br>
    OO.OOO.O.OOOOOOO.O.. </br>
    O.....OOOOOO.....OO. </br>
    O..O.O.O.O.OOO.OO..O </br>
    ..OO.OOOO.O...OO.... </br>
    OOOO..OO..O..O.OOOOO </br>
    .O.OO.O.O.O.O.OOO.O. </br>
    .O..OOOO..OO.OO..OOO </br>
    OO.......O.......OO. </br>
    OOOO....OO.OO..O.... </br>
    O..OO.OO.......OO..O </br>
    Do you want to see the next state? y/n </br>
    y </br>
    OO..OO.O....OOO.OOO. </br>
    O.OO.............OO. </br>
    .OOO.O......OO.OOOO. </br>
    O....O....O........O </br>
    O.........O..O....OO </br>
    ........O.O.O....... </br>
    .O.OO.OOO.OOOOO....O </br>
    ...OOOOO.O...OO.OO.O </br>
    ...OO..OOOO....O.OO. </br>
    O..OO..OO......OO... </br>
    Do you want to see the next state? y/n </br>
    n </br>
    Game Over </br>
