package lambdaExpression;

interface CLS {
    int getLength(String str);
}

//class LOS implements CLS {
//
//    @Override
//    public int getLength(String str) {
//        return str.length();
//    }
//}

public class LunchLambdaExp3 {
    public static void main(String[] args) {

        //  Option #1 create a class and implement interface and then create Obj of that class
//        LOS los = new LOS();
//        int stt = los.getLength("Istanbul");
//        System.out.println(stt);

        // Option #2
        CLS cls = new CLS() {
            @Override
            public int getLength(String str) {
                return str.length();
            }
        };
        System.out.println(cls.getLength("Macenta"));

        //Option #3 use Lambda expression
        CLS clambda = str -> str.length();
        System.out.println(clambda.getLength("Conakry"));

        //Or
        CLS clambda1 = String::length;
        System.out.println(clambda1.getLength("Kankan"));

        //OR
        CLS cllamda = (str) -> {
            return str.length();
        };
        System.out.println(cllamda.getLength("Ankara"));

    }
}
