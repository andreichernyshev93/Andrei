package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2015,50,150000);
        airplane.setYear(2014);
        airplane.setLength(45);
        airplane.fillUp(3000);
        airplane.fillUp(1500);
        airplane.info();
    }
}
