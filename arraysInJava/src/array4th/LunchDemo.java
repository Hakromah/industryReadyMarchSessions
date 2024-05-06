package array4th;

class Alpha {
	int age;
	String name;

	public Alpha(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alpha [" + "age=" + age + ", name='" + name + '\'' + ']';
		//this overriding will prevent the default toString() method from printing
		//the hash code reference variable.
	}
}

public class LunchDemo {
	public static void main(String[] args) {
		Alpha ap = new Alpha(20, "Amara");
		System.out.println(ap);
		//has code reference address obj will be printed. toString() is giving this hash code reference obj
		//to avoid this we need to override toString() method
	}
}
