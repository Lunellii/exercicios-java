import java.util.Scanner;

public class Uni3Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       System.out.println("Insira o peso: ");
       double peso = teclado.nextDouble();

       System.out.println("Insira a altura da pessoa em metros: ");
       double altura = teclado.nextDouble();

       double imc = peso / (altura * altura);

       System.out.println("O IMC da pessoa é " + imc);

        teclado.close();

    }
}
