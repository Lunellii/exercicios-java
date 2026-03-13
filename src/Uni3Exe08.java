import java.util.Scanner;
public class Uni3Exe08 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double cotacaodolar = 5.65;
        
        System.out.println("Insira o valor em dolares: ");
        double dolarecebido = teclado.nextDouble();

        double valorreais = dolarecebido * cotacaodolar;

        System.out.println("O atendente deve devolver R$" + valorreais + " para o cliente.");

        teclado.close();

    }
}