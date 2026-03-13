import java.util.Scanner;

public class Uni3Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o salario mensal do funcionario: ");
        double salarioMensal = teclado.nextDouble();

        System.out.println("Insira o numero de meses trabalhados: ");
        double mesesTrabalhados = teclado.nextDouble();

        double decimo3 = (salarioMensal / 12) * mesesTrabalhados;

        System.out.println("O Valor do 13° salário é R$" + decimo3);

        teclado.close();

    }
}
