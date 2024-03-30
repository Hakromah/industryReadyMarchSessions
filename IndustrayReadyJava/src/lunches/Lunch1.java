package lunches;

public class Lunch1 {
	public static void main(String[] args) {
		int i, j;
		int n = 10;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				//if ((i == 0 || i == n - 1 || (j == 0 || j == n - 1) || (i == (n - 1) / 2))|| (j==(n-1)/2))
				//if ((j==0 && i>0 && i<n-1) || (i==0 && j> 0) || (i==n-1 && j>0))
				//if ((j==0 && i>0 && i<n-1) || (i==0 && j> 0) || (i==n-1 && j>0))
				//if ((i == 0 && j > 0 && j < n - 1) || (i == n - 1 && j > 0 && j < n - 1) || (j == 0 && i > 0 && i < n - 1) || (j == n - 1 && i > 0 && i < n - 1))
				if (j==0 ||(i==0 && j<n-1) || (i==n-1 && j <n-1) || j==n-1 && i>0 && i<n-1)
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
