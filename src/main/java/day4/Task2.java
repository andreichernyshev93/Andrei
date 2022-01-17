package day4;

import java.util.Arrays;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 0;
        }System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        int min = numbers[0];
        int x = 0;
        int sum = 0;
        for (int num : numbers){
            if (num > max) {
                max = num;
            }if (num < min) {
                min = num;
            }if (num % 10 == 0) {
                x++;
                sum = sum + num;
            }
        }System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + x);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}

