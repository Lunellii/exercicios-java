import java.util.Scanner;

public class Uni3Exe18 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quilometragem percorrida: ");
        double kmpercorrido = teclado.nextDouble();

        System.out.println("Digite o tempo gasto em minutos: ");
        double tempogastominutos = teclado.nextDouble();

        double totalemhoras = tempogastominutos / 60;
        double velmdkmh = kmpercorrido / totalemhoras;
        double ritmdpmn = tempogastominutos / kmpercorrido;

        System.out.printf("Tempo total em horas: %.2f h\n", totalemhoras);
        System.out.println("Velocidade média: " + velmdkmh + " km/h");
        System.out.println("Ritmo médio: " + ritmdpmn + " min/km");

        teclado.close();

    }
    
}
