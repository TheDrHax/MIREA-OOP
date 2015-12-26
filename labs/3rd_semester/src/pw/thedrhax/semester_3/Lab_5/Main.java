package pw.thedrhax.semester_3.Lab_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Сортировка массива строк методом пузырька
    public static String[] bubbleSort (String[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j].toLowerCase().charAt(0) > array[j+1].toLowerCase().charAt(0)) {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    // Сортировка массива строк методом выбора
    public static String[] selectSort (String array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].toLowerCase().charAt(0) > array[j].toLowerCase().charAt(0)) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String text = "Ласточка весною в сени к нам летит";
        String array[] = text.split(" ");

        // Задание 1а
        System.out.println("1a) Сортировка массива строк пузырьком");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSort(array)));

        // Задание 1б
        System.out.println("1б) Сортировка массива строк выбором");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectSort(array)));

        // Задание 3
        System.out.println("3) Переворачивание строки");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        text = sc.nextLine();
        StringBuilder buffer = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            buffer.append(text.charAt(i));
        }
        System.out.println(buffer);

        // Задание 4
        System.out.println("4) Проверка на палиндром");
        boolean isPolyndrom = true;
        for (int i = 0; i < text.length(); i++)
            if (text.toLowerCase().charAt(text.length()-1-i) != text.toLowerCase().charAt(i))
                isPolyndrom = false;
        System.out.println("Введенная строка - " + (isPolyndrom ? "" : "не ") + "палиндром");

        // Задание 5
        System.out.println("5) Сортировка букв в каждом слове");
        StringBuilder result = new StringBuilder();
        for (String word : text.split(" ")) {
            String letter_array[] = new String[word.length()];
            for (int i = 0; i < word.length(); i++)
                letter_array[i] = word.substring(i, i+1);
            letter_array = selectSort(letter_array);
            for (String s : letter_array) {
                result.append(s);
            }
            result.append(" ");
        }
        System.out.println(result);

        // Задание 6
        System.out.println("6) Посчитать появления указанной буквы");
        System.out.print("Введите букву: ");
        char letter = sc.nextLine().charAt(0);
        int count = 0;
        for (char c : text.toCharArray())
            if (c == letter) count++;
        System.out.println("Буква '" + letter + "' встречается " + count + " раз(а)");
    }

}
