package opps;

class Pen {
    String color = "Gray";
    String brand = "Natariq";
    int price = 10;

    public void write() {
        System.out.println("Writing the next C.N movie");
    }

    public int getSomething() {
        return 10;
    }
}

public class OopsDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();

        pen.getSomething();
        pen.write();
    }
}

// JVM -> Java Virtual Machine -> ByteCode

// Code -> javac -> bytecode -> jvm (Objects)

// classes -> blueprint

// object -> data, methods
