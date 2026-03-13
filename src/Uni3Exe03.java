import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double precodagasolina = 5.64;
        System.out.println("Qual seria o valor que gostaria de colocar em gasolina? ");
        System.out.println("Gasolina Comum: R$" + precodagasolina);
        double valor = teclado.nextDouble();
        double litros = valor / precodagasolina;
        System.out.println("Valor total do pagamento: R$" + valor);
        System.out.printf("Total de litros: %.2f\n", litros);

        teclado.close();


    }
}