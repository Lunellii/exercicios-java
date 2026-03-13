import java.util.Scanner;
public class Uni3Exe06{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorkg = 25;
        double prato = 0.750;
        System.out.println("Valor por quilo: R$" + valorkg);
        System.out.println("Tara do prato: " + prato + "kg");
        System.out.println("Insira o peso do prato: ");
        double pesototal = teclado.nextDouble();
        double comida = pesototal - prato;
        double valortotal = comida * valorkg;

        System.out.println("O valor do prato do cliente é R$" + valortotal);

        teclado.close();

    }
}