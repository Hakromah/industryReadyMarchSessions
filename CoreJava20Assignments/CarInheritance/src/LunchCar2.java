class Car1 {
    private String make;
    private String model;
    private int year;
    private String color;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.print("Make: " + make + "");
        System.out.print("Model: " + model + "");
        System.out.print("Year: " + year + "");
        System.out.print("Color: " + color + "");
        System.out.println(" ");
    }
}


public class LunchCar2 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.setMake("Honda");
        car1.setModel("Civic");
        car1.setYear(2010);
        car1.setColor("Black");
        car1.display();

        Car1 car2 = new Car1();
        car2.setMake("Toyota");
        car2.setModel("Camry");
        car2.setYear(2015);
        car2.setColor("Red");
        car2.display();

        Car1 car3 = new Car1();
        car3.setMake("Isuzu");
        car3.setModel("Altima");
        car3.setYear(2019);
        car3.setColor("White");
        car3.display();

        Car1 car4 = new Car1();
        car4.setMake("Nissan");
        car4.setModel("Rogue");
        car4.setYear(2020);
        car4.setColor("Blue");
        car4.display();
    }
}
