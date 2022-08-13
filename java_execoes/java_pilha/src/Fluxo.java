public class Fluxo {

    public static void main(String[] args) {
        System.out.println("MAIN BEGIN");
        try {
            m1();
        }catch (ArithmeticException | NullPointerException | MyException ex) {
            String msgEx = ex.getMessage();
            System.out.println("Exception - " + msgEx);
            ex.printStackTrace();
        }
        System.out.println("MAIN END");
    }

    public static void m1() {
        System.out.println("M1 BEGIN");
        m2();
        System.out.println("M1 END");
    }

    public static void m2() {
        System.out.println("M2 BEGIN");
        throw new MyException("My Exception");
    }
}