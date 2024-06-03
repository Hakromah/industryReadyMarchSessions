import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        System.out.println("Interest Rate Calculator:");
        Scanner scan = new Scanner(System.in);

        double ri = 0.05;
        System.out.println("The interest rate is "+ ri * 100 + "%");

        System.out.println("Enter principle amount...");
        double pm = scan.nextDouble();

        System.out.println("Enter number of years");
        int ny = scan.nextInt();

        double ir = (pm * ny * ri);
        System.out.println("Simple interest is: " + ir + " for " + ny + " years");
    }
}
