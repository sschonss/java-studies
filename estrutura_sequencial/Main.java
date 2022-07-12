import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 22;
        double x = 10.543324554;

        System.out.println(y);
        System.out.println(x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "João";
        int idade = 30;
        double salario = 1020.00;

        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, salario);

    }
}
