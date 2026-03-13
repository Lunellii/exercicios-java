import java.util.Scanner;

public class Uni3Exe04{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculo de média ponderada");
        System.out.println("Digite a nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota: ");
        double nota3 = teclado.nextDouble();

        double mediaponderada = (nota1 * 5) + (nota2 * 3) + (nota3 * 2);
        double mediafinal = mediaponderada / 10;

        System.out.println("A média final é de: " + mediafinal);

        teclado.close();

    }
}