class Car {
    private String make;
    private int year;
    private String model;

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {
        System.out.print("Made:" + make);
        System.out.print(" In: " + year);
        System.out.print(" Model: " + model);
        System.out.println(" ");
    }
}


public class LunchCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Honda");
        car1.setYear(2010);
        car1.setModel("Civic");
        car1.display();

        Car car2 = new Car();
        car2.setMake("Toyota");
        car2.setYear(2015);
        car2.setModel("Camry");
        car2.display();

        Car car3 = new Car();
        car3.setMake("Isuzu");
        car3.setYear(2019);
        car3.setModel("Altima");
        car3.display();

    }
}
