public class TesteGerente {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Nico");
        g.setSalario(18000);
        g.setCpf("987.765.423-12");

        System.out.println(g.getBonificacao());
        System.out.println(g.getNome());
        System.out.println(g.getCpf());

        g.setSenha(2344);

        boolean autenticou = g.autentica(2344);

        System.out.println(autenticou);

        System.out.println(g.getBonificacao());
    }


}
