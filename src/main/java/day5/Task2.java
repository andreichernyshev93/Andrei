package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Honda", "черный", 2010 );
        System.out.println("Мотоцикл " + motorbike1.getModel() + ", цвет " + motorbike1.getColor() + ", год выпуска "
                + motorbike1.getYear());
    }
}
class Motorbike {
    String model, color;
    int year;
    public Motorbike (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
}