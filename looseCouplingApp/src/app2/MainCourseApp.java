package app2;

import app2.services.SQL;

public class MainCourseApp {
    public static void main(String[] args) {

        Telusko tk  = new Telusko();// Target Object Class

        //dependency injection
        tk.setCourseServices(new SQL());// dependent Object

       boolean status = tk.buyTheCourse(45.6);
       if (status)
           System.out.println("Purchased");
       else
           System.out.println("Failed to purchase");
    }
}
