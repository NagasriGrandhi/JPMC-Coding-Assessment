package exercise;

import com.jpmc.code.exercise.CellEnum;
import com.jpmc.code.exercise.ConwaysGameOfLife;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConwaysGameOfLife {
    ConwaysGameOfLife conwaysGameOfLife = new ConwaysGameOfLife();

    @Before
    public void beforeTest() {
    }

    @Test(expected = NullPointerException.class)
    public void findNextStateWithNullInput() {
        conwaysGameOfLife.findNextState(null);
    }

    @Test
    public void findNextStateWithInput() {
        CellEnum[][] inputGrid = CellEnumTestUtil.createInputGrid();
        CellEnum[][] outputGrid = conwaysGameOfLife.findNextState(inputGrid);
        Assert.assertArrayEquals(CellEnumTestUtil.getExpectedGrid(), outputGrid);
    }

    @Test
    public void findNextStateWithOutputAsInput() {
        CellEnum[][] inputGrid = CellEnumTestUtil.getExpectedGrid();
        CellEnum[][] outputGrid = conwaysGameOfLife.findNextState(inputGrid);
        Assert.assertArrayEquals(CellEnumTestUtil.createInputGrid(), outputGrid);
    }
}
