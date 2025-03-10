import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 / 7 e dira qual dia da semana representa o numero digitado.");

        System.out.println("Digite um numero de 1 a 7: ");
        int numero = scanner.nextInt();


        switch (numero) {

            case 1:
                System.out.println("O dia referente ao numero 1 e Segunda-Feira");
                break;

            case 2:
                System.out.println("O dia referente ao numero 2 e Terca-Feira");
                break;

            case 3:
                System.out.println("O dia referente ao numero 3 e Quarta-Feira");
                break;

            case 4:
                System.out.println("O dia referente ao numero 4 e Quinta-Feira");
                break;

            case 5:
                System.out.println("O dia referente ao numero 5 e Sexta-Feira");
                break;

            case 6:
                System.out.println("O dia referente ao numero 6 e Sabado");
                break;

            case 7:
                System.out.println("O dia referente ao numero 7 e Domingo");
                break;
        }


    }
}
