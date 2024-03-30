package lunches;

public class Lunch3 {
	public static void main(String[] args) {

		// Alphabets

		int i,j;
		int n = 9;

		// #1: K
		for (i =0; i<n; i++) {
			for ( j = 0; j < n; j++) {
				if (j==0 || (i +j==(n-1)/2) || i-j ==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: Z
			for (j = 0; j < n; j++) {
				if (i==0 || i==(n-1)|| i+j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: Q
			for (j = 0; j < n; j++) {
				if (i==0 && j>0&&j<(3*(n-1)/4) ||
					(j==0 && i>0 && i< 3* (n-1)/4)||
					(i==3*(n-1)/4 &&j>0 && j<3*(n-1)/4) ||
					(j==3*(n-1)/4 && i>0 && i<3*(n-1)/4) ||
					i==j && i >= (n-1)/2)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: H
			for (j = 0; j < n; j++) {
				if (j==0 || j==n-1 || i==(n-1)/2)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: A
			for (j = 0; j < n; j++) {
				if (i==0 && j >0 && j<n-1 || j==0 && i>0 || j==n-1 && i>0 || i==(n-1)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: S
			for (j = 0; j < n; j++) {
				if ((i == 0 && j > 0) ||( j == 0 && i > 0 && i<(n-1)/2) ||
					( j == n - 1 && i >=(n-1)/2) || i == (n - 1) / 2 || i==n-1 && j>0)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (j = 0; j < n; j++) {
				if ((i == 0 && j > 0) || (j == 0 && i > 0 && i < (n - 1) / 2) ||
					(j == n - 1 && i >= (n - 1) / 2) || i == (n - 1) / 2 || i == n - 1 && j>0 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: A
			for (j = 0; j < n; j++) {
				if (i==0 && j >0 && j<n-1 || j==0 && i>0 || j==n-1 && i>0 || i==(n-1)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: N
			for (j = 0; j < n; j++) {
				if ((j==0 || i==j) || j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: X
			for (j = 0; j < n; j++) {
				if ((i==j || i+j==n-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: Y
			for (j = 0; j < n; j++) {
				if ((i ==j && i<(n-1)/2) || (i+j ==n-1 && i<(n-1)/2) || j== (n-1)/2 && i>= (n-1)/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			// #2: P
			for (j = 0; j < n; j++) {
				if ((i==0 && j>0 && j<n-1) || j== 0 && i>0 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");

			System.out.println();
		}
	}
}
