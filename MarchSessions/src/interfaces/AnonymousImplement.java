package interfaces;

interface Beta1 {
    void show();
}


public class AnonymousImplement {
    public static void main(String[] args) {
        //Anonymous inner class
        //lambda expression

        Beta1 beta = new Beta1() {
            public void show() {

            }
        };
        beta.show();

        int i =10;
        if (i<6){
            System.out.println(i);
        }

    }

}
