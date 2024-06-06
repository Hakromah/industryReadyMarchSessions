abstract class BankAccount {
	protected double balance;

	public BankAccount(double initial) {
		this.balance = initial;
	}

	abstract void deposit(double amount);

	abstract void withdrawal(double amount);

	abstract void displayBalance();
}

class SavingAccount extends BankAccount {

	private double interestRate;

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount + (amount * (interestRate / 100));
			System.out.println("Deposited " + amount + " to your saving account");
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	@Override
	void withdrawal(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew " + amount + " from your saving account");
		} else {
			System.out.println("Invalid or you have insufficient amount to be withdrew");
		}
	}

	@Override
	void displayBalance() {
		System.out.println("The saving account balance is $" + balance);
	}
}

class CheckingAccount extends BankAccount {

	private double overdraftLimit;

	public CheckingAccount(double initial, double overdraftLimit) {
		super(initial);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited $" + amount + " to your checking account");
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	@Override
	void withdrawal(double amount) {
		if (amount > 0 && amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrew $" + amount + " from your checking account");
		}
	}

	@Override
	void displayBalance() {
		System.out.println("The checking account balance is $" + balance);
	}
}

public class BankAccountInherit {
	public static void main(String[] args) {

		SavingAccount saving = new SavingAccount(1000, 0.5);
		saving.deposit(1000);
		saving.withdrawal(500);
		saving.displayBalance();
		System.out.println("*".repeat(40));

		CheckingAccount checking = new CheckingAccount(100, 1000);
		checking.deposit(1000);
		checking.withdrawal(1000);
		checking.displayBalance();
	}
}
