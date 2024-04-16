package opps.statics;


import java.util.Scanner;

class Farmers {

	float principalAmount;
	float timeDuration;
	float simpleInterest;

	static float interestRate;

	static {
		interestRate = 2.5f;
	}

	void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the loan amount required: ");
		principalAmount = scanner.nextFloat();

		System.out.println("Enter the time duration required: ");
		timeDuration = scanner.nextFloat();
	}

	void compute() {
		simpleInterest = principalAmount * timeDuration * interestRate / 100.0f;
	}

	void display() {
		System.out.println("The Simple Interest is: " + simpleInterest);
	}
}

public class LunchStaticApplication {
	public static void main(String[] args) {
		System.out.println("Farmer1:");
		Farmers f1 = new Farmers();
		f1.input();
		f1.compute();
		f1.display();
		System.out.println("-".repeat(30));

		System.out.println("Farmer2:");
		Farmers f2 = new Farmers();
		f2.input();
		f2.compute();
		f2.display();
		System.out.println("-".repeat(30));

		System.out.println("Farmer3:");
		Farmers f3 = new Farmers();
		f3.input();
		f3.compute();
		f3.display();
		System.out.println("-".repeat(30));

	}
}
