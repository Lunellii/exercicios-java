import java.util.Scanner;
public class Uni3Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para calcular o Volume de uma lata precisamos de algumas informações:");
        System.out.println("Digite o Raio da lata: ");
        double raio = teclado.nextDouble();
        System.out.println("Digite a Altura da lata: ");
        double altura = teclado.nextDouble();
        double volume = Math.PI * (raio * raio) * altura;
        
        System.out.printf("O volume da lata de óleo é: %.2f\n", volume);

        teclado.close();


    }
}