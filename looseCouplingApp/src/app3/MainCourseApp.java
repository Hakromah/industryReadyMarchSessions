package app3;

import app3.services.NextJs;

public class MainCourseApp {
    public static void main(String[] args) {

        Coursera coursera = new Coursera();//Target object

        coursera.setService(new NextJs());

        boolean status = coursera.buyCourses(55.9);
        if (status)
            System.out.println("Course Purchased!");
        else
            System.out.println("Failed to Purchased the Course Try again!!");

    }

}
