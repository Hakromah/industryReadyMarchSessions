package app2;

import app2.services.CourseServices;

public class Telusko {


    private CourseServices courseServices;

    public void setCourseServices(CourseServices courseServices) {
        this.courseServices = courseServices;
    }

    boolean buyTheCourse(double amount) {
        return courseServices.getTheCourses(amount);
    }
}
