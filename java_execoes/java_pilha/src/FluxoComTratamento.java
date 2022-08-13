public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("MAIN BEGIN");
        try {
            m1();
        }catch (ArithmeticException | NullPointerException ex) {
            String msgEx = ex.getMessage();
            System.out.println("Exception - " + msgEx);
            //ex.printStackTrace();
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
        for(int i = 1; i<=5; i++){
            System.out.println(i);

            int a = i / 0;
            Conta c = null;
            c.deposita();

        }
        System.out.println("M2 END");
    }
}