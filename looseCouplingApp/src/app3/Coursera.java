package app3;

import app3.services.CourseService;

public class Coursera {

    private CourseService service;

    public void setService(CourseService service) {
        this.service = service;
    }

    boolean buyCourses(double quantity){
        return service.getTheCourse(quantity);
    }
}
