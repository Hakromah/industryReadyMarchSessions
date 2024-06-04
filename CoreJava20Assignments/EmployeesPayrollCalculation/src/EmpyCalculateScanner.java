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
}



public class EmpyCalculateScanner {
	// Let define static variables for regular hours and overtime rate
	public static final int REGULAR_HOURS = 40;
	public static final double OVERTIME_RATE_MULTIPLIER = 1.5;


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<EmployeeScanner> employees = new ArrayList<>();

		while (true){
			//Get Employee details
			System.out.print("Enter employee name: ");
			String name = scanner.nextLine();

			System.out.print("Enter hours worked: ");
			double hoursWorked = scanner.nextDouble();

			System.out.print("Enter hourly rate: ");
			double hourlyRate = scanner.nextDouble();

			System.out.println("Calculate Payroll: ");
			System.out.println("☻".repeat(20));

			// Calculate payroll
			//double payroll = calculatePayroll(hoursWorked, hourlyRate);
			// Store employee details
			//employees.add(new Employee(name, hoursWorked, hourlyRate, payroll));
			// Clear the newline left by nextDouble()
			scanner.nextLine();
		}
	}
}
