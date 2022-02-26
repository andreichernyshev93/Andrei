package day14.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people");

        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList (File file){
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String [] human = line.split(" ");

                if (Integer.parseInt(human[1]) < 0)
                    throw new IOException();

                Person person = new Person(human[0], Integer.parseInt(human[1]));

                list.add(person);

            }

            return list;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Некорректный входной файл");

        }

        return null;

    }

}
