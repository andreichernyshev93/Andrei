package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse wareHouse;
    private static final int SALARY_PAYMENT = 80;

    public Picker(Warehouse wareHouse) {
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
        return "Picker {" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += SALARY_PAYMENT;
        wareHouse.ordersAssembly();
    }

    @Override
    public void bonus() {
        if (wareHouse.getCountPickedOrders() < 10_000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;

    }

}
