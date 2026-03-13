import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       System.out.println("Insira o valor da compra: ");
       int valordacompra = teclado.nextInt();
       System.out.println("Insira o valor pago: ");
       int valorpago = teclado.nextInt();

       int troco = valorpago - valordacompra;

       int notas100 = troco / 100;
       troco = troco % 100;
        
       int notas10 = troco / 10;
       troco = troco % 10;

       int notas1 = troco / 1;
       troco = troco % 1;

       int totaldenotas = notas100 + notas10 + notas1;

       System.out.println("O número total de notas é de: " + totaldenotas);
       System.out.println("O número de notas de 100 é de: " + notas100);
       System.out.println("O número de notas de 10 é de: " + notas10);
       System.out.println("O número de notas de 1 é de: " + notas1);

       teclado.close();

    }
    
}
