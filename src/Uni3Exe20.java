import java.util.Scanner;

public class Uni3Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double gasolina = 5.75;
        double etanol = 4.29;
        
        System.out.println("Insira a quantidade de litros de Gasolina: ");
        double lGasolina = teclado.nextDouble();

        System.out.println("Insira a quantidade de litros de Etanol: ");
        double lEtanol = teclado.nextDouble();

        double totalG = lGasolina * gasolina;
        double totalE = lEtanol * etanol;

        double valortotal = totalG + totalE;

        System.out.println("Valor gasolina: R$" + totalG);
        System.out.println("Valor etanol: R$" + totalE);
        System.out.println("Valor total: R$" + valortotal);

        teclado.close();

    }
}
