import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = teclado.nextDouble();
        double desconto = valor * 0.12;
        double valorcomdesconto = valor - desconto;
        System.out.println("O Valor do desconto é de R$" + desconto);
        System.out.println("O preço do par de sapatos com desconto é de R$" + valorcomdesconto);

        teclado.close();

    }
}
