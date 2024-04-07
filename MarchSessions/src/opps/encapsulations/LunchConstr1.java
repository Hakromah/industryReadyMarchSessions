package opps.encapsulations;

class Students{
    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class LunchConstr1 {
    public static void main(String[] args) {
        Students students = new Students("Ahmet",28);
        System.out.println(students.getName());
        System.out.println( students.getAge());
    }
}
