package opps.encapsulations;

class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class LunchEncap3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Amara");
        emp.setAge(25);
        emp.setSalary(15000.25);

        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getSalary());
    }
}
