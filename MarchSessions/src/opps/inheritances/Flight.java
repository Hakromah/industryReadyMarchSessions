package opps.inheritances;

class Flights {
    int cost;

    void fly() {
        cost = 4;
        System.out.println("Flight is flying ");
    }
}


class PassengerInFlight extends Flights {
    void display() {
        System.out.println("Cost is " + cost);
    }
}

public class Flight {
    public static void main(String[] args) {
        PassengerInFlight p = new PassengerInFlight();
        p.fly();
        p.display();
    }
}
