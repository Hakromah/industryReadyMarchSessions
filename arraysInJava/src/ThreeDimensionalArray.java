import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // multiple arrays declaration
        int[][] arr = new int[3][];// [3] will assign only length of classroom
        arr[0] = new int[4]; // class [0] has [4] students
        arr[1] = new int[5]; // class [1] has [5] students
        arr[2] = new int[3]; // class [2] has [3] students


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
