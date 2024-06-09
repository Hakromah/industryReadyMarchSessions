package eclipseDebuggers;

public class DebuggerApp1 {

	public static void main(String[] args) {

		System.out.println("License App Started");

		System.out.println("Age data added");

		int age = 18;
		int minAge = 18;
		int maxAge = 60;

		if (age >= minAge && age <= maxAge) {
			System.out.println("You are eligible to attend" + age);
		} else {
			System.out.println("You are underage!!" + age);
		}
		System.out.println("License App Logg out");

		disp();

	}

	public static void disp() {
		System.out.println("Display method of LunchApp class");
		for (int i = 1; i < 4; i++) {
			System.out.println(i);
		}
		System.out.println("Display method activity finished");
	}

}
