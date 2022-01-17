package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");}
        int i = a + 1;
        while (i < b){
            i = i + 1;
            if (i % 10 == 0){
                System.out.print("");
            } else if (i % 5 == 0){
                System.out.print(i + " ");
            }
            else {
                System.out.print("");
            }
        }
    }
}
