public class SistemaInterno {

    private int senha = 2222;

    public void auntentica(Autenticavel fa){

        boolean antenticou = fa.autentica(this.senha);
        if(antenticou){
            System.out.println("Logado");
        }else{
            System.out.println("ERRO! Senha invalida");
        }

    }

}
