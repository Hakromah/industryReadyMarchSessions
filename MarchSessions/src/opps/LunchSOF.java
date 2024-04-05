package opps;

class Alpha{
    void add(){
        System.out.println("Hey, from add");
        //add(); Stack Overflow
    }
    void show(){
        System.out.println("Hey from show");
    }
}


public class LunchSOF {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.add();a.show();
    }
}
