package lunches;

public class Lunch4 {
    public static void main(String[] args) {


        int i, j;
        int n = 17;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if ((i+j <=(n-1)/2) || (j-i>=(n-1)/2) || (i-j>=(n-1)/2) || (i+j>=(n-1)/2 +n-1)|| i==0 || j==0 || i==n-1|| j==n-1)

                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            for (j = 0; j < n; j++) {
                if ((i + j >= (n - 1) / 2) &&j<=(n-1)/2 && i<=(n-1)/2||
                        (i - j <= (n - 1) / 2) && j<=(n-1)/2 && i>=(n-1)/2||
                        (j - i <= (n - 1) / 2)&& j>=(n-1)/2 && i<=(n-1)/2||
                        (i + j <= (n - 1) / 2 + n - 1) && j>=(n-1)/2 && i>=(n-1)/2)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Let's Divide them

            for (j = 0; j < n; j++) {

                if ((i + j >= (n - 1) / 2) && j <= (n - 1) / 2 && i <= (n - 1) / 2 ||
                        (i - j <= (n - 1) / 2) && j <= (n - 1) / 2 && i >= (n - 1) / 2
                        ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (j = 0; j < n; j++) {
                if ( (j - i <= (n - 1) / 2)&& j>=(n-1)/2 && i<=(n-1)/2||
                        (i + j <= (n - 1) / 2 + n - 1) && j>=(n-1)/2 && i>=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for (j = 0; j < n; j++) {
                if ((i + j >= (n - 1) / 2) &&j<=(n-1)/2 && i<=(n-1)/2||
                        (j - i <= (n - 1) / 2)&& j>=(n-1)/2 && i<=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (j = 0; j < n; j++) {
                if ((i - j <= (n - 1) / 2) && j<=(n-1)/2 && i>=(n-1)/2||
                        (i + j <= (n - 1) / 2 + n - 1) && j>=(n-1)/2 && i>=(n-1)/2)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2)
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
