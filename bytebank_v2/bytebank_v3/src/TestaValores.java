public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(2673, 4234984);
        Conta conta2 = new Conta(2673, 4239984);
        Conta conta3 = new Conta(2673, 4236984);
        Conta conta4 = new Conta(2673, 4234984);

        System.out.println(Conta.getTotal());
    }

}
