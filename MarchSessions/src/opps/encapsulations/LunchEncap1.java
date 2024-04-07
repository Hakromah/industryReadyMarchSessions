package opps.encapsulations;

class Books {
    private int pageNum;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int x) {
        pageNum = x;
    }
}

public class LunchEncap1 {

    //Encapsulation is providing control access to data member of class
    // by restricting direct access using private keyword
    public static void main(String[] args) {
        Books books = new Books();
        books.setPageNum(-100);
        System.out.println(books.getPageNum());
    }
}
