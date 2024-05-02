package app1.services;

public class MNG implements DeliveryServices {
    @Override
    public boolean deliverTheProduct(double amount) {
        System.out.println("Product Delivered With MNG and amount is " + amount);
        return true;
    }
}
