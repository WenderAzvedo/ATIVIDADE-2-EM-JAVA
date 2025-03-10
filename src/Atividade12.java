
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("             CARDAPIO                ");
        System.out.println("=====================================");

        System.out.println("ESCOLHA SEU PRATO");
        System.out.println("1 - Filé ao Molho Madeira");
        System.out.println("2 - Salmão Grelhado com Purê de Mandioquinha");
        System.out.println("3 - Risoto de Camarão");
        System.out.println("4 - Lasanha à Bolonhesa");

        System.out.println("Digite o numero do pedido escolhido: ");
        int numPedido = scanner.nextInt();
        switch (numPedido) {

            case 1:
                System.out.println("O prato escolhido foi Filé ao Molho Madeira");
                break;

            case 2:
                System.out.println("O prato escolhido foi Salmão Grelhado com Purê de Mandioquinha");
                break;

            case 3:
                System.out.println("O prato escolhido foi Risoto de Camarão");
                break;

            case 4:
                System.out.println("O prato escolhido foi Lasanha à Bolonhesa");
                break;

            default:
                System.out.println("NUMERO NAO CORRESPONDE A NENHUM PRATO DO NOSSO CARDAPIO. POR FAVOR, ESCOLHA UM NUMERO VALIDO.");

        }
        scanner.close();

    }
}
