import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double velocidadeMedia;
        double combustivelGasto;
        var kmPorLitro = 12;

        System.out.println("Digite a distância percorrida: ");
        double kmPercorrido = teclado.nextDouble();

        System.out.println("Digite o tempo de viagem:");
        double tempo = teclado.nextDouble();

        velocidadeMedia = kmPercorrido / tempo;
        combustivelGasto = kmPercorrido / kmPorLitro;

        System.out.println("A velocidade média foi de " + velocidadeMedia + " km/h e a quantidade de combustível usado foi " + combustivelGasto + " litros.");
    
        teclado.close();
    
    }

}
