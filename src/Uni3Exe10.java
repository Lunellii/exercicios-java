import java.util.Scanner;
public class Uni3Exe10 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para conseguirmos calcular a Hipotenusa de um triângulo retângulo, precisamos de algumas informações: ");
        System.out.println("Digite o valor do cateto oposto: ");
        double cateto1 = teclado.nextDouble();
        System.out.println("Digite o valor do cateto adjacente: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenuso é: " + hipotenusa);

        teclado.close();

    }
}