package day8;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 0; i < 20001; i++) {
            String string = String.valueOf(i);
            System.out.print(string+" ");
        }

        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i =0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb);

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }
}
