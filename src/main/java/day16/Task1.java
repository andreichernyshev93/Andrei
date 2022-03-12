package day16;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        printResult(file);

    }

    public static void printResult (File file){
        try {
            Scanner scanner = new Scanner(file);

            if (file.length() == 0){
                throw new EOFException();
            }

            String line = scanner.nextLine();
            String [] numbers = line.split(" ");

            int sum = 0;

            for (String number : numbers)
                sum += Integer.parseInt(number);

            double sum1 = (double) sum / numbers.length;

            System.out.printf(sum1 + " --> %.3f", sum1);

        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (EOFException e) {
            System.out.println("Пустой файл");
        }
    }

}

