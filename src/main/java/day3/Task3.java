package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            double x = s.nextDouble();
            double y = s.nextDouble();
            i++;
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);
        }


    }
}
