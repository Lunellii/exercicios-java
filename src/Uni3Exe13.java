import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
       
        double precoazulejo = 12.5;
        System.out.println("Por favor digite o comprimento da parede: ");
        double comprimento = teclado.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double altura = teclado.nextDouble();

        double area = comprimento * altura;
        double azulejos = area * 9.0;
        double valortotal = azulejos * precoazulejo;

        System.out.println("A area total da parede é de: " + area);
        System.out.println("Ira usar " + azulejos + " azulejos, e ira gastar o toal de: R$" + valortotal);

        teclado.close();

    }

}
