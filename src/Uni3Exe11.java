import java.util.Scanner;
public class Uni3Exe11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em °C para ser convertida em Fahrenheit: ");
        double celsius = teclado.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + "C° em Fahrenheit: " + fahrenheit + "F°");

        teclado.close();

    }
}