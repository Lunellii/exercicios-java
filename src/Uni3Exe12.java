import java.util.Scanner;
public class Uni3Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double salarioLiquido;
        double salarioBruto;

        double valorHora = 10;
        double valorDependente = 60;
        
        System.out.println("Digite o nome do Funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Insira quantas horas o funcionário trabalhou: ");
        double horas = teclado.nextDouble();
        System.out.println("Insira quantos dependentes o funcionário tem: ");
        int dependentes = teclado.nextInt();
        
        salarioBruto = (horas * valorHora) + (dependentes * valorDependente);
        double inss = salarioBruto * 0.085;
        double ir = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - inss - ir; 

        System.out.println("O funcionário " + nome + " possui um salário bruto de R$"+ salarioBruto+ " e um salário líquido de R$"+ salarioLiquido);
        teclado.close();

    }
}