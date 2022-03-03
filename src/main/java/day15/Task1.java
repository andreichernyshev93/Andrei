package day15;


import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String separator = File.separator;
        File file = new File(separator + "Users" + separator + "Brux" + separator + "Desktop" + separator +
                "Новая папка (2)" + separator + "Andrei" + separator + "src" + separator + "main" + separator +
                "resources" + separator + "shoes.csv");

         File file1 = new File(separator + "Users" + separator + "Brux" + separator + "Desktop" + separator +
                 "Новая папка (2)" + separator + "Andrei" + separator + "src" + separator + "main" + separator +
                 "resources" + separator + "missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file);

            if (file.length() == 0){
                throw new EOFException();
            }

            PrintWriter pw = new PrintWriter(file1);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String [] shoes = line.split(";");

                if (shoes.length > 3){
                    throw new IOException();
                }

                if (Integer.parseInt(shoes[2]) == 0)
                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);

            }
            pw.close();
            scanner.close();


        }
        catch (EOFException e) {
            System.out.println("Пустой файл");
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println("Некорретный файл");
        }
    }
}