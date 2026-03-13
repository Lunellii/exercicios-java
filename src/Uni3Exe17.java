import java.util.Scanner;

    public class Uni3Exe17{
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);

            double valorcamisa = 35;
            double desconto = .10;
            double valordesconto = 0;

            System.out.println("Digite a quantidade de camisas: ");
            int camisa = teclado.nextInt();

            double valortotal = camisa * valorcamisa;
            if (camisa >= 3) {
                valordesconto = valortotal * desconto;
            }

            double valorfinal = valortotal - valordesconto;

            System.out.println("Valor total: R$" + valortotal);
            System.out.println(" Valor total de desconto: R$" + valordesconto);
            System.out.println(" Valor final: R$" + valorfinal);

            teclado.close();

        }
    }
