package day12.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        cycle(list, 0, 30);

        System.out.println(list);

        cycle(list, 300, 350);

        System.out.println(list);
    }

    public static void cycle(List<Integer> list,int a, int b){
        for (int i = a; i <= b; i++){
            if (i % 2 == 0) {
                list.add(i);
            }

        }
    }
}
