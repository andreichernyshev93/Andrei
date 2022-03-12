package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");


        try {
            PrintWriter pw1 = new PrintWriter(file1);

            int[] numbers = new int[1000];
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(101);
                pw1.print(numbers[i] + " ");
            }
            pw1.close();

            PrintWriter pw2 = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);

            int sum = 0;
            int counter = 0;

            String line = scanner.nextLine();
            String[] numbers1 = line.split(" ");

            for (String number : numbers1) {
                sum += Integer.parseInt(number);
                counter++;

                if (counter == 20) {
                    pw2.print((sum / 20.0) + " ");

                    sum = 0;
                    counter = 0;
                }

            }
            pw2.close();
            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        printResult(file2);
    }
    public static void printResult (File file){
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;

            String line = scanner.nextLine();
            String [] numbersString = line.split(" ");

            for (String number : numbersString){
                sum += Double.parseDouble(number);
            }

            System.out.println((int)sum);
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}
