package app.services;

public class ArasKargo implements DeliveryServices {
    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("Product Delivered With ArasKargo, and amount is " + amount);
        return true;
    }
}
