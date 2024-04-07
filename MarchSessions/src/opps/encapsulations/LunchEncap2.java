package opps.encapsulations;

class Student {
    private String name;
    private int age;
    private double avg;

//    void setData(String name, int age, double avg) {
//        name = name;
//        age = age;
//        avg = avg;
//    }

    /*Whenever there is naming conflict between local
     * variable and instance variable within a method
     * like setter, called SHADOWING  problem
     * to resolve it we 'this' keyword
     *
     *this keyword differentiates the local and
     * instance variables in the method.
     * It also holds the address of currently running object */

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvg() {
        return avg;
    }


}

public class LunchEncap2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Fatuma");
        st.setAge(20);
        st.setAvg(22.5);
        System.out.println("Name: " + st.getName());
        System.out.println("Age: " + st.getAge());
        System.out.println("Average: " + st.getAvg());
    }
}
