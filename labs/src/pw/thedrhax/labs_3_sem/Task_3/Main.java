package pw.thedrhax.labs_3_sem.Task_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static int[] generateArray (int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        return array;
    }

    public static void main(String[] args) {
        int[] first = generateArray(10);
        int[] second = generateArray(10);
        System.out.println("first = " + Arrays.toString(first));
        System.out.println("second = " + Arrays.toString(second));

        // Задание 1
        int min = random.nextInt(10);
        System.out.println("1) Если элементы меньше " + min + ", заменить их на " + min);
        for (int i = 0; i < first.length; i++)
            if (first[i] < min) first[i] = min;
        System.out.println("first = " + Arrays.toString(first));

        // Задание 2
        int a = random.nextInt(5); int b = random.nextInt(5)+5;
        System.out.println("2) Заменить все элементы в диапазоне [" + a + ", " + b + "] нулями");
        for (int i = a; i < b; i++)
            first[i] = 0;
        System.out.println("first = " + Arrays.toString(first));

        // Задание 3
        System.out.println("3) Поменять местами первый и последний элементы");
        int temp = first[0];
        first[0] = first[first.length-1];
        first[first.length-1] = temp;
        System.out.println("first = " + Arrays.toString(first));

        // Задание 4
        System.out.println("4) Найти сумму и среднее арифметическое");
        int sum = 0;
        for (int i : first) sum += i;
        System.out.println("Сумма: " + sum + "; Среднее: " + sum/first.length);

        // Задание 5
        System.out.println("5) Сумма квадратов всех элементов");
        sum = 0;
        for (int i : first) sum += i * i;
        System.out.println(sum);

        // Задание 6
        System.out.println("6) Сумма попарных произведений двух массивов");
        sum = 0;
        for (int i = 0; i < first.length; i++)
            sum += first[i] * second[i];
        System.out.println(sum);

        // Задание 7
        System.out.println("7) Евклидово расстояние между массивами");
        sum = 0;
        for (int i = 0; i < first.length; i++)
            sum += Math.pow(first[i] - second[i], 2);
        System.out.println(Math.sqrt(sum));

        // Задание 8
        System.out.println("8) Минимальный и максимальный элемент массива");
        min = 10; int max = 0;
        for (int i : first) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимум: " + min + ", максимум: " + max);

        // Задание 9
        System.out.println("9) Сортировка выбором");
        System.out.println(Arrays.toString(first));
        for (int i = 0; i < first.length; i++) {
            for (int j = i+1; j < first.length; j++) {
                if (first[j] < first[i]) {
                    temp = first[i];
                    first[i] = first[j];
                    first[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(first));

        // Задание 10
        System.out.println("10) Сортировка пузырьком");
        System.out.println(Arrays.toString(second));
        for (int i = 0; i < second.length-1; i++) {
            for (int j = 0; j < second.length-i-1; j++) {
                if (second[j] > second[j+1]) {
                    temp = second[j];
                    second[j] = second[j+1];
                    second[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(second));
    }

}
