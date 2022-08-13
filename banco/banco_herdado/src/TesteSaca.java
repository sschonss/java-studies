public class TesteSaca {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(1000);
        cc.saca(1200);
        System.out.println(cc.getSaldo());
    }
}
