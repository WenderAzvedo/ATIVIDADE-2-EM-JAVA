import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("============ CALCULADORA ==============");

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("=====================================");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SAIR");
        System.out.println("=====================================");

        System.out.println("DIGITE A OPÇÃO ESCOLHIDA: ");
        int escolha = scanner.nextInt();



        switch (escolha){

            case 1:
                System.out.println("SOMA");
                System.out.println("O resultado e: " + (num1 + num2));
                break;

            case 2:
                System.out.println("SUBTRAIR");
                System.out.println("O resultado e: " + (num1 - num2));
                break;

            case 3:
                System.out.println("MULTIPLICAR");
                System.out.println("O resultado e: " + (num1 * num2));
                break;

            case 4:
                System.out.println("DIVIDIR");
                System.out.println("O resultado e: " + (num1 / num2));
                break;

            case 5:
                System.out.println("SAIR");
                System.exit(0);
        }

        scanner.close();
    }
}
