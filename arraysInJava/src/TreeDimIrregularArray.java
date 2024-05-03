import java.util.Arrays;

public class TreeDimIrregularArray {
	public static void main(String[] args) {
		// 3 Dimensional -> Jagged/Irregular Array
		// 2 schools; Data is Irregular we cannot give the value of student.
		// -> school 0 has 2 classrooms class 0-> 3 stud and class 1-> 4 studs
		// -> school 1 has 3 classrooms class 0-> 2 stud and class 1-> 4 studs class 2->3

		int[][][] ar = new int[2][][];
		//school & class
		ar[0] = new int[2][];
		ar[1] = new int[3][];

		//school 0, class & students
		ar[0][0] = new int[3];
		ar[0][1] = new int[4];

		//school 1, class & students
		ar[1][0] = new int[2];
		ar[1][1] = new int[4];
		ar[1][2] = new int[3];

	}
}
