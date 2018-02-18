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
    
   For example, the console output would be
   Enter t for testing JPMC test input or Enter r for testing random input:(t/r)
    t
    Setting the grid size 6 x 8 
    ......O.
    OOO...O.
    ......O.
    ........
    ...OO...
    ...OO...
    Do you want to see the next state? y/n
    y
    .O......
    .O...OOO
    .O......
    ........
    ...OO...
    ...OO...
    
    Enter t for testing JPMC test input or Enter r for testing random input:(t/r)
    r
    Setting the grid size 10 x 20 
    OO.OOO.O.OOOOOOO.O..
    O.....OOOOOO.....OO.
    O..O.O.O.O.OOO.OO..O
    ..OO.OOOO.O...OO....
    OOOO..OO..O..O.OOOOO
    .O.OO.O.O.O.O.OOO.O.
    .O..OOOO..OO.OO..OOO
    OO.......O.......OO.
    OOOO....OO.OO..O....
    O..OO.OO.......OO..O
    Do you want to see the next state? y/n
    y
    OO..OO.O....OOO.OOO.
    O.OO.............OO.
    .OOO.O......OO.OOOO.
    O....O....O........O
    O.........O..O....OO
    ........O.O.O.......
    .O.OO.OOO.OOOOO....O
    ...OOOOO.O...OO.OO.O
    ...OO..OOOO....O.OO.
    O..OO..OO......OO...
    Do you want to see the next state? y/n
    n
    Game Over
