package lunches;

public class Lunch2 {
	public static void main(String[] args) {
		// we will draw the following characters in starts
		// K M N X Y Z V M Q R

		int i, j;
		int n = 10;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if ((i == j) || (i + j == n - 1))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");

			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");

			for (j = 0; j < n; j++) {
				if ((i == j) || (i + j == n - 1) || i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");

			for (j = 0; j < n; j++) {
				if ((i+j ==(n-1)/2) || (j-i==(n-1)/2) || (i-j==(n-1)/2) || (i+j==(n-1)/2 +n-1))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// let's add border around it
			System.out.print("   ");

			for (j = 0; j < n; j++) {
				if ((i+j ==(n-1)/2) || (j-i==(n-1)/2) || (i-j==(n-1)/2) || (i+j==(n-1)/2 +n-1)|| i==0 || j==0 || i==n-1|| j==n-1)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
