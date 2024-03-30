package main;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number:");
//        int num = scanner.nextInt();
//        switch (num) {
//            case 2, 7, 6, 10 -> System.out.println("Positive number");
//            case -1 -> System.out.println("Negative Number");
//            case 0 -> System.out.println("Zero");
//            default -> System.out.println(num);
//        }

        // alarm 6am for weekends, 7am for weekdays and 8am for Wednesday
        System.out.println("Enter first 3 digits of day:");
        String days = scanner.nextLine();

        switch (days) {
            case "Sat", "Sun" -> System.out.println("6am");
            case "Wed" -> System.out.println("8am");
            default -> System.out.println("7am");
        }
        // Assign a variable in enhanced switch
        String day = "Wed";
        int time = 0;
//        switch (day) {
//            case "Sat", "Sun" -> time = 6;
//            case "Wed" -> time = 8;
//            default -> time = 7;
//        }

        // Switch Expression
        time = switch (day) {
            case "Sat", "Sun" -> 6;
            case "Wed" -> 8;
            default -> 7;
        };
        System.out.println(time);

    }
}
