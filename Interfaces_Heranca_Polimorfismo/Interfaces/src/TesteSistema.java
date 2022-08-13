public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador a = new Administrador();
        a.setSenha(2311);

        Cliente c = new Cliente();
        c.setSenha(2222);


        SistemaInterno si = new SistemaInterno();
        si.auntentica(g);
        si.auntentica(a);
        si.auntentica(c);

    }
}
