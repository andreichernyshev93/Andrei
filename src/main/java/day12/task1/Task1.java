package day12.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("BMW", "AUDI", "Mercedes", "HONDA", "Toyota"));
        System.out.println(cars);

        cars.add(2, "Mazda");

        cars.remove(0);

        System.out.println(cars);
    }
}
