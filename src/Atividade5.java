import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salario: ");
        double salario = scanner.nextDouble();

        if (salario >= 1640) {

            System.out.println("Voce recebe pelo menos um salario minimo ");

        } else{

            System.out.println("Voce recebe menos que um salario minimo");

        }
        scanner.close();
    }
}
