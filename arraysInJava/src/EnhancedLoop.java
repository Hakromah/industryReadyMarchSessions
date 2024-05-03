

public class EnhancedLoop {
	public static void main(String[] args) {

		// 2 D

		int[][] arr = new int[2][3];
		arr[0][0]= 5;
		arr[0][1]= 4;
		arr[0][2]= 9;

		arr[1][0]= 4;
		arr[1][1]= 9;
		arr[1][2]= 7;

		int ar[][]= {{51, 59, 70, 96,},{63, 100, 10, 60,}};


		for (int i[] : ar) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		// Enhanced Loop
//		int ar[] = {4, 3, 5, 6};
//
//		for (var a : ar) {
//			System.out.print(a + " ");
//		}
//		System.out.println();
//
//		//for Loop
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		System.out.println();


	}
}
