import java.util.Scanner;
public class Uni3Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double lata = 0.35;
        double garrafa = 0.6;
        double garrafa2 = 2;

        System.out.println("Digite o numero de latas de 350ml: ");
        int qntlata = teclado.nextInt();
        System.out.println("Digite o numero de garrafas de 600ml: ");
        int qntgarrafa = teclado.nextInt();
        System.out.println("Digite o numero de garrafas de 2L: ");
        int qntgarrafa2 = teclado.nextInt();

        double qnttotallitros = (qntlata * lata) + (qntgarrafa * garrafa) + (qntgarrafa2 * garrafa2);
        int qnttotalgarrafas = qntlata + qntgarrafa + qntgarrafa2;

        System.out.println("O cliente comprou ao total " + qnttotallitros + " Litros");
        System.out.println("Ao total " + qnttotalgarrafas + " unidades.");

        teclado.close();

    }
}