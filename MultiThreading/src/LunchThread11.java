// Producer class
class Producer extends Thread {
    Queue queue; //loose coupling method
    int i = 0;

    public Producer(Queue q) {
        queue = q;
    }

    @Override
    public void run() {
        while (true) {
            queue.produce(i++);// different values will be created
        }

    }
}

//consumer class
class Consumer extends Thread {
    Queue queue;

    public Consumer(Queue q) {
        queue = q;
    }

    @Override
    public void run() {
        while (true) {
            queue.consume();
        }
    }
}

//Queue class is the parent class for Producer and Consumer
class Queue {
    int data;

    boolean flag = false; // flag is used to create communication between producer and consumer

    synchronized public void produce(int value) {
        try {
            if (flag) {
                System.out.println("Production is waiting...");
                wait();
            } else {
                data = value;
                System.out.println("I have produced data: " + data);
                flag = true;
                notify();
            }
        } catch (Exception e) {
            System.out.println(" ");
        }
    }

    synchronized public void consume() {

        try {
            if (!flag) {
                System.out.println("Consumption is waiting...");
                wait();
            } else {
                System.out.println("I have consumed data: " + data);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println(" ");
        }
    }
}


public class LunchThread11 {
    public static void main(String[] args) {

        // If we don't create communication between producer and consumer then Producer
        // will continue producing data infinitely as log as he got chance.
        // and Consumer will continue consuming data infinitely as log as he got chance.

        // Solution: Create communication between producer and consumer.
        // by wait() and notify() methods.
        Queue q = new Queue();

        Producer p1 = new Producer(q);
        Consumer c1 = new Consumer(q);

        p1.start();
        c1.start();

        //new Producer(q).start(); // you can also do like this like you are not creating
        // reference of producer and consumer class.
        //new Consumer(q).start();
    }
}
