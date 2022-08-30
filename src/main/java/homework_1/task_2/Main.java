package homework_1.task_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[] = {5, 6, 3, 2, 5, 1, 4, 9};

        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    // Сортировка пузырьком по возрастанию.
    public static void sort(int array[]) {
        if (array == null || array.length == 0) return;

        for (int i = 0; i < array.length - 1; i++) {

            boolean flag = true;

            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag) break;
        }
    }
}