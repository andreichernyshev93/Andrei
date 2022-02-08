package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse wareHouse;
    private static final int SALARY_PAYMENT = 100;

    public Courier(Warehouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += SALARY_PAYMENT;
        wareHouse.ordersDelivery();
    }

    @Override
    public void bonus() {
        if (wareHouse.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }
        salary += 50000;
        isPayed = true;
    }
}
