public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario luiz = new Gerente();
        luiz.setNome("Luiz Schons");
        luiz.setCpf("123.123.123-23");
        luiz.setSalario(4500.0);
        System.out.println("O funcionario " + luiz.getNome() + " tem um salario de " + luiz.getSalario() + " e ganha " + luiz.getBonificacao() + " de bonificacao");
    }
}
