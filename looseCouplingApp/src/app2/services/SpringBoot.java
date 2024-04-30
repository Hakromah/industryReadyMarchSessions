package app2.services;

public class SpringBoot implements CourseServices {
    @Override
    public boolean getTheCourses(double amount) {
        System.out.println("Spring Boot Course purchased and the amount is " + amount);
        return true;
    }
}
