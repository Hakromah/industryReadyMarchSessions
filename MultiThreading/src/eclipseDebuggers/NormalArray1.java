package eclipseDebuggers;

import java.util.Scanner;

public class NormalArray1 {

	public static void main(String[] args) {
		// Ctrl + Shift + B ==> Breakpoint
		System.out.println("Welcome to Student Grades Management Application");

		int[] arr = new int[5];
		int len = arr.length;

		System.out.println("len");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < len; i++) {
			System.out.println("Enter the marks of Student " + i);
			arr[i] = scan.nextInt();
		}

		System.out.println("Marks of Student stored as ");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
