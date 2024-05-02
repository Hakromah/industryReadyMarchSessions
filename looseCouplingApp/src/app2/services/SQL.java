package app2.services;

public class SQL implements CourseServices {
    @Override
    public boolean getTheCourses(double amount) {
        System.out.println("SQL Course purchased and the amount is " + amount);
        return true;
    }
}
