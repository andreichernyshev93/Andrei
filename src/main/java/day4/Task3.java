package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int max = 0;
        int index = 0;
        int sum = 0;
        int [][] numbers = new int [m] [n];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                numbers[i][j] = random.nextInt(51) + 0;
            }
        }for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }System.out.println();

        }for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                sum = sum + numbers[i][j];
                if (sum > max){
                    max = sum;
                    index = i;
                }
            }
            sum = 0;
        }System.out.println("Индекс строки, сумма чисел в которой максимальна: " + index + "  // " + max);



    }
}
