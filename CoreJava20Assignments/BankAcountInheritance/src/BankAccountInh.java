import java.text.NumberFormat;

abstract class BankAccount1 {

	protected double balance;

	public BankAccount1(double initial) {
		this.balance = initial;
	}

	abstract void deposit(double amount);

	abstract void withdrawal(double amount);

	abstract void displayBalance();
}

class SavingAccount1 extends BankAccount1 {

	private double interest;
	private int duration;

	public SavingAccount1(double initial, double interest, int duration) {
		super(initial);
		this.interest = interest;
		this.duration = duration;
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount + (amount * ((interest / 100) * duration));
			System.out.println(NumberFormat.getCurrencyInstance().format(amount) + " is deposited successfully to saving account ☻☻☻");
		} else {
			System.out.println("Invalid deposit");
		}
	}

	@Override
	void withdrawal(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(NumberFormat.getCurrencyInstance().format(amount) + " amount withdrew successfully");
		}
	}

	@Override
	void displayBalance() {
		System.out.println("Saving balance: -> " + NumberFormat.getCurrencyInstance().format(balance));
	}
}

class CheckingAccount1 extends BankAccount1 {
	private double overdraftLimit;// this amount that bank allows you to withdraw if your balance is insufficient
	// it is like a short term loan.

	public CheckingAccount1(double initial, double overdraftLimit) {
		super(initial);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(NumberFormat.getCurrencyInstance().format(amount) + " is deposited successfully to saving account ☻☻☻");
		} else {
			System.out.println("Invalid Deposit try again");
		}
	}

	@Override
	void withdrawal(double amount) {
		if (amount > 0 && amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println(NumberFormat.getCurrencyInstance().format(amount) + " amount withdrew successfully");
		} else {
			System.out.println("Invalid Withdrawal try again");
		}
	}

	@Override
	void displayBalance() {
		System.out.println("Checking Account balance: " + NumberFormat.getCurrencyInstance().format(balance));
	}
}

public class BankAccountInh {
	public static void main(String[] args) {
		SavingAccount1 saving = new SavingAccount1(1.0, 0.2, 3);
		System.out.println("Saving Account Records: \n" + "•".repeat(25));
		saving.deposit(5000);
		saving.withdrawal(3000);
		saving.displayBalance();

		System.out.println("♠".repeat(25));
		System.out.println("Checking Account Records: \n" + "•".repeat(25));

		CheckingAccount1 check = new CheckingAccount1(200, 2000);
		check.deposit(5000);
		check.withdrawal(2500);
		check.displayBalance();

	}
}
