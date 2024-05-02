package app3.services;

public class NodeJs implements CourseService{
    @Override
    public boolean getTheCourse(double quantity) {
        System.out.println("NodeJs Course Purchased and it quantity is " + quantity);
        return true;
    }
}
