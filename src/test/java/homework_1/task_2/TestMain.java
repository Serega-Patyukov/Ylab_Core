package homework_1.task_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestMain {

    @Test
    public void testSort_1() {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        int[] array_expecteds = {1, 2, 3, 4, 5, 5, 6, 9};
        Main.sort(array);
        Assert.assertTrue(Arrays.equals(array_expecteds, array));

        array = new int[]{5, 4, 3, 2, 1, 0};
        array_expecteds = new int[]{0, 1, 2, 3, 4, 5};
        Main.sort(array);
        Assert.assertTrue(Arrays.equals(array_expecteds, array));
    }

    @Test
    public void testSort_2() {
        Main.sort(null);
        Main.sort(new int[]{});
    }
}