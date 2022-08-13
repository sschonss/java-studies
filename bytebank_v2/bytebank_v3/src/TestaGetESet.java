public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(2134, 4523552);

        System.out.println(conta.getNumero());

        Cliente luiz = new Cliente();
        luiz.setNome("Luiz");
        conta.setTitular(luiz);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        System.out.println("Meu nome: " + conta.getTitular().getNome() + " e minha profissao: " + conta.getTitular().getProfissao() + " o numero da minha conta: " + conta.getNumero());

        System.out.println(Conta.getTotal());
    }
}
