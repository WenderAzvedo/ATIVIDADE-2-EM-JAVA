import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = scanner.nextDouble();

        if (salario < 1000) {

           double salarioreaju = salario * 1.30;
            System.out.println("O seu novo salario é de: R$" + salarioreaju);

        }else {

            System.out.println("O aumento é somente para funcionarios que recebem menos de R$1000,00");

        }

        scanner.close();
    }

}
