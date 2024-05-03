class Telusko {
	int noOfYears;
	String location;
	char abbreviation;
}

public class charArrys {
	public static void main(String[] args) {
		// store 5 characters in an array
		//char []c = new char[5];
		//String []str = new String[5];


		// Create an array of Telusko objects
		Telusko[] tar = new Telusko[3];
		tar[0] = new Telusko();
		tar[1] = new Telusko();
		tar[2] = new Telusko();

		// Set values for each object
		tar[0].location = "Conakry";
		tar[0].noOfYears = 25;
		tar[0].abbreviation = 'K';

		tar[1].location = "Istanbul";
		tar[1].noOfYears = 30;
		tar[1].abbreviation = 'T';

		tar[2].location = "Ankara";
		tar[2].noOfYears = 29;
		tar[2].abbreviation = 'B';

		// Loop through the array and print values
		for (int i = 0; i < tar.length; i++) {
			System.out.println("Object " + i + " Company " + i + ":");
			System.out.println("Location: " + tar[i].location);
			System.out.println("Number of Years: " + tar[i].noOfYears);
			System.out.println("Abbreviation: " + tar[i].abbreviation);
			System.out.println(); // Just for spacing
		}
	}
}
