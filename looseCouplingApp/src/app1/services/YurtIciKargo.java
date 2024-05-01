package app1.services;

public class YurtIciKargo implements DeliveryServices {
    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("Product Delivered With YurtIcıKargo, and amount is " + amount);
        return false;
    }
}
