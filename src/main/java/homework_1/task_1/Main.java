package homework_1.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[10][10];

        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Park_Miller_Random_Numbers.uniform();
            }
        }

        System.out.println(Arrays.deepToString(array));

        double max = array[0][0];
        double min = array[0][0];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array[i][j];
                if (array[i][j] < min) min = array[i][j];
                sum += array[i][j];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sr = " + sum / (array.length * array[0].length));
    }
}