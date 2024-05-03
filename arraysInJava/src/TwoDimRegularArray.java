import java.util.Scanner;

public class TwoDimRegularArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 3 classrooms, & 4 students in each class
        int[][] arr = new int[3][4];
//        arr[2][1] = 55; // this will assign 55 to 2nd class student 2
//        arr[0][3] = 45; // this will assign 45 to class 1 student 4
//        System.out.println(arr.length);//3 classrooms
//        System.out.println(arr[0].length);//4 students each

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the marks of class " + i + " student " + j);
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Marks of students stored as followed:");
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
