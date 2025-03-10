import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 12 para ver o mes correspondente: ");
        int mes = scanner.nextInt();

        switch (mes) {

            case 1:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " JANEIRO");
                break;

            case 2:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " FEVEREIRO");
                break;

            case 3:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " MARÇO");
                break;

            case 4:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " ABRIL");
                break;

            case 5:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " MAIO");
                break;

            case 6:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " JUNHO");
                break;

            case 7:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " JULHO");
                break;

            case 8:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " AGOSTO");
                break;

            case 9:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " SETEMBRO");
                break;

            case 10:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " OUTUBRO");
                break;

            case 11:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " NOVEMBRO");
                break;

            case 12:
                System.out.println("O MES CORRESPONDENTE AO NUMERO " + mes + " DEZEMBRO");
                break;

            default:
                System.out.println("NÃO A MES CORRESPONDENTE ESTE NUMERO!");
                break;
        }
        scanner.close();
    }
}
