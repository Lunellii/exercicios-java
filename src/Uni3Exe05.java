import java.util.Scanner;
public class Uni3Exe05{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double chipidnt = 4;
        //chip alimento = 3,5 cada, para um frango é necessario 2 tags = 3,5+3,5
        double chipalimento =7;
        System.out.println("Calculo de gasto para marcação de frangos.");
        System.out.println("Insira a quantidade de frangos :");
        int qntfrango = teclado.nextInt();
        double valortotal = qntfrango * (chipidnt + chipalimento);
        System.out.println("O Gasto total para marcar os " + qntfrango + " frangos é de R$" + valortotal);

        teclado.close();

    }
}