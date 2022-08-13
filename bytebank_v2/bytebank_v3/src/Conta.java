public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

        System.out.println("Uma nova conta foi criada: A sua agencia eh: " + agencia + " e o seu numero eh: " + numero);
        System.out.println("O total de contas abertas = " + Conta.total);
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public double getSaldo() {

        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }


    public int getAgencia() {
        return agencia;
    }



    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
