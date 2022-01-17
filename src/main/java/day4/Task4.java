package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        int sum = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10001);
        }System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 8; i++){
            for (int k = i; k < i+3; k++){
                sum = sum + numbers[k];
            }
            System.out.println(sum);
            if (sum > max){
                max = sum;
                index = i;
                }sum = 0;
        }
        System.out.println(max);
        System.out.println(index);

    }
}
