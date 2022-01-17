package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] mass = new int [n];



        Random random = new Random();
        for (int i = 0; i < mass.length; i++){
            mass [i] = random.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("Длина массива: " + mass.length);
        int x = 0;
        for (int b = 0; b < mass.length; b++) {
                if (mass[b] > 8){
                    x++;}
        }
        System.out.println("Количество чисел больше 8: " + x);
        int y = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == 1){
                y++;
            }
        }
        System.out.println("Количество чисел равных 1: " + y);
        int z = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] % 2 == 0){
                z++;
            }
        }
        System.out.println("Количество четных чисел: " + z);
        int w = n - z;
        System.out.println("Количество нечетных чисел: " + w);
        int sum = 0;
        for (int sup:mass){
            sum = sum + sup;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
