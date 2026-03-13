import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        System.out.println(centena + " Centena(s) "
                        + dezena + " Dezena(s) "
                        + unidade + " Unidade(s)");

        teclado.close();


    }
    
}
