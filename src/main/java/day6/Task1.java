package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.info();

        System.out.println("Разница между годом выпуска авто и введенным годом "+car.yearDifference(2020));
        Motorbike motorbike = new Motorbike("","",2010);
        motorbike.info();

        System.out.println("Разница между годом выпуска мотоцикла и введенным годом "+motorbike.yearDifference(2015));
    }
}
