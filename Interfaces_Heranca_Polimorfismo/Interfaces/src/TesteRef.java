public class TesteRef {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSalario(6500.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(4200.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
