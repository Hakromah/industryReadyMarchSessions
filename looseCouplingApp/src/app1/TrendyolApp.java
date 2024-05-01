package app1;

import app1.services.DeliveryServices;

public class TrendyolApp {

    private DeliveryServices services; // new MNG()

    public void setServices(DeliveryServices services) {
        this.services = services;
    }

    boolean initiateDelivery(double amount) {
        return services.deliverTheProduct(amount);
    }
}
