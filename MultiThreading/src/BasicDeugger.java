import java.util.Scanner;

public class BasicDeugger {

    public static void main(String[] args) {
        System.out.println("Driving license for 18 years or older.");
        Scanner scan=new Scanner(System.in);
        int age;
        int minAge = 18;
        int maxAge = 75;
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        if (age >= minAge && age <= maxAge) {
            System.out.println("You are allowed to drive.");
        } else {
            System.out.println("You are not allowed to drive.");
        }
        System.out.println("Application finished.");
    }

}
