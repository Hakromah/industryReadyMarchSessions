package app2.services;

public class Hibernate implements CourseServices{

    @Override
    public boolean getTheCourses(double amount) {
        System.out.println("Hibernate Course purchased and the amount is " + amount);
        return true;
    }

}
