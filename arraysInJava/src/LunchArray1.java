import java.util.Scanner;

public class LunchArray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Total of students: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the marks of students " + i);
            arr[i] = scan.nextInt();
        }

        System.out.println("The marks stored are as followed:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
