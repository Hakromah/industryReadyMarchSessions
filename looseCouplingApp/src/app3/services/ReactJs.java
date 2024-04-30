package app3.services;

public class ReactJs implements CourseService {
    @Override
    public boolean getTheCourse(double quantity) {
        System.out.println("ReactJs Course Purchased and it quantity is " + quantity);
        return true;
    }
}
