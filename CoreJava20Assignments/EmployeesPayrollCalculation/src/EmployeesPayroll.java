import java.sql.SQLOutput;

class Employee {
	private String name;
	private int hoursWorked;
	private double hourlyRate;

	public Employee(String name, int hoursWorked, double hourlyRate) {
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public String getName() {
		return name;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}


}

class PayrollCalculator {

		public static void calculatePayroll(Employee employee) {

			int regularHours = Math.min(employee.getHoursWorked(), 40);
			int overtimePay = Math.max(employee.getHoursWorked() - 40, 0);

			double regularPay = regularHours * employee.getHourlyRate();
			double overtimePayRate = employee.getHourlyRate() * 1.5;
			double overtimePayAmount = overtimePay * overtimePayRate;
			double totalPay = regularPay + overtimePayAmount;

			System.out.println("Employee: " + employee.getName());
			System.out.println("Regular Hours: " + regularHours);
			System.out.println("Overtime Hours: " + overtimePay);
			System.out.println("Regular Pay: " + regularPay);
			System.out.println("Overtime Pay: " + overtimePayAmount);
			System.out.println("Total Pay: " + totalPay);
			System.out.println("♣".repeat(20));

		}
}

public class EmployeesPayroll {
	public static void main(String[] args) {

		Employee employee1 = new Employee("Aisha", 40, 18.5);
		Employee employee2 = new Employee("Paul", 45, 18.5);

		PayrollCalculator.calculatePayroll(employee1);//Aisha
		PayrollCalculator.calculatePayroll(employee2);//Paul

	}



}
