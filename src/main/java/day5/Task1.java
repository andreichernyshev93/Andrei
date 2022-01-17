package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ауди");
        car1.setColor("белый");
        car1.setYear(2020);
        System.out.println("Продаю автомобиль " + car1.getModel() + " цвет " + car1.getColor()+ " " + car1.getYear()
                + " год выпуска");
    }
}
class Car{
    String model, color;
    int year;

    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
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