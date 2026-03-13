import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);

        System.out.println("Para calcular a Area do retangulo, é necessário multiplicar a ladoA x ladoB.");
        
        System.out.println("Digite a medida do LadoA:");
        double ladoA = teclado.nextDouble();
        
        System.out.println("Digita a medida do LadoB:");
        double ladoB = teclado.nextDouble();

        double area = ladoA * ladoB;
        
        System.out.println("A Área do retangulo é de " + area + "m²");
        
        teclado.close();
    
    }
}