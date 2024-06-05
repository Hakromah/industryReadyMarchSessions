import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeScanner {

	private String name;
	private double hoursWorked;
	private double hourlyRate;
	private double payroll;

	EmployeeScanner(String name, double hoursWorked, double hourlyRate) {
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}


	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + '}';
	}
}


public class EmpyCalculateScanner {
	// Let define static variables for regular hours and overtime rate
	public static final int REGULAR_HOURS = 40;
	public static final double OVERTIME_RATE_MULTIPLIER = 1.5;

	public static void calculatePayroll(int hoursWorked, double hourlyRate) {
		if (hoursWorked <= REGULAR_HOURS) {
			double pay = hoursWorked * hourlyRate;
			System.out.println(NumberFormat.getCurrencyInstance().format(pay));
			//This way, it can print the correct value along with the currency symbol.
		} else {
			//System.out.println("$"+REGULAR_HOURS * hourlyRate + (hoursWorked - REGULAR_HOURS) * hourlyRate * OVERTIME_RATE_MULTIPLIER);
			double regularPay = REGULAR_HOURS * hourlyRate;
			double overtimePay = (hoursWorked - REGULAR_HOURS) * hourlyRate * OVERTIME_RATE_MULTIPLIER;
			double totalPay = regularPay + overtimePay;
			System.out.println(NumberFormat.getCurrencyInstance().format(totalPay));
		}
	}


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<EmployeeScanner> employees = new ArrayList<>();

		while (true) {
			//Get Employee details
			System.out.print("Enter employee name: ");
			String name = scanner.nextLine();

			System.out.print("Enter hours worked: ");
			int hoursWorked = scanner.nextInt();

			System.out.print("Enter hourly rate: ");
			double hourlyRate = scanner.nextDouble();

			System.out.println("Calculated Payroll: ");
			calculatePayroll(hoursWorked, hourlyRate);

			employees.add(new EmployeeScanner(name, hoursWorked, hourlyRate));
			System.out.println(employees);

			System.out.print("Enter 'y' to continue or 'n' to exit: ");
			String response = scanner.next();

			if (response.equals("y")) {
				scanner.nextLine();
			} else {
				break;
			}
		}
	}
}
