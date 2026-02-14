import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário-base: ");
        float salario_base = sc.nextFloat();

        double gratificacao = salario_base * (5.0 / 100);
        double imposto = salario_base * (7.0 / 100);
        double salario_final = salario_base + gratificacao - imposto;

        System.out.println("gratificação: " + gratificacao);
        System.out.println("imposto: " + imposto);
        System.out.println("Salário-Final: " + salario_final);
    }
}
