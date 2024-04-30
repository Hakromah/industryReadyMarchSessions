package app3.services;

public class NextJs implements CourseService {
    @Override
    public boolean getTheCourse(double quantity) {
        System.out.println("NextJs Course Purchased and it quantity is " + quantity);
        return true;
    }
}
