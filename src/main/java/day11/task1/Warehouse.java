package day11.task1;

public class Warehouse {
    private int countPickedOrders, countDeliveredOrders;

    public Warehouse() {
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public String toString(){
        return "Собранных заказов - " + countPickedOrders + ". Доставленных заказов - " + countDeliveredOrders + ".";
    }

    public void ordersAssembly() {
        countPickedOrders++;
    }

    public void ordersDelivery() {
        countDeliveredOrders++;
    }
}
