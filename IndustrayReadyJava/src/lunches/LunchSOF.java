package lunches;

class Alpha{
	int i=0;
	void display(){
		System.out.println("From Alpha");
		i++;
		//System.out.println(i); //17036 stacks will be created based on my computer capacity
		//display();// it throws Stack Overflow error
	}

	void add(){
		System.out.println("From Add");
	}
}
public class LunchSOF {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.add();
		a.display();
	}
}
