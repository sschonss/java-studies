public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(1000);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(2000);

		cc.transfere(120, cp);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
	}
	
}
