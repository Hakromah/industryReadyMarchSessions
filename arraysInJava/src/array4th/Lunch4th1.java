package array4th;

import java.util.Arrays;

public class Lunch4th1 {
	public static void main(String[] args) {

		double[] ar = new double[125859664]; //Max Integer size is 9 digits
		//double[] arr = new double[-4]; // array size cannot be negative;
		//it will not throw compile error bcz -1 is an integer But it will throw Runtime Error
		// because array size cannot be (-)

		// Array is index based data structure to store data of same type(homogeneous type)
		// Array size must be of int type and range also must not surpass int data type range
		// Array size in fixed and cannot grow or shrink


		//Demo d = new Demo(); demo class doesn't exists
		int[] ar1 = new int[5];
		double[] ar2 = new double[5];
		char[] ar3 = new char['A'];

		//System.out.println(ar1.getClass().getName()); // [I
		//System.out.println(ar2.getClass().getName()); // [D
		//System.out.println(ar3.getClass().getName()); // [C

		int[] ar4 = {2, 10, 5, 9};
		int[] ar5 = {2, 4, 5, 8};

		System.out.println(Arrays.compare(ar4, ar5));

		//Arrays --> is a utility class all the method in the Arrays class are static,
		// you do not need to create object, you call them directly like Arrays.sort()

		System.out.println("Data before sorting");
		for (int v : ar4) {
			System.out.print(v+ " ");
		}
		System.out.println();

		System.out.println("Data after sorting");
		Arrays.sort(ar4);
		for (int v : ar4) {
			System.out.print(v+ " ");
		}
		System.out.println();

	}
}
