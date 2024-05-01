package app1;

import app1.services.ArasKargo;

public class MainApp {


    public static void main(String[] args) {

        TrendyolApp targetObj = new TrendyolApp();//Target object

        //-->setter injection<--\\
        //targetObj.setServices(new MNG());//dependent Object
        //targetObj.setServices(new YurtIciKargo());//dependent Object
        targetObj.setServices(new ArasKargo());//dependent Object

        boolean status = targetObj.initiateDelivery(445.9);
        if (status)
            System.out.println("Delivered");
        else
            System.out.println("Failed to Deliver");
    }
}
