import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a sua conta bancaria!");

        System.out.println("Digite o numero de sua conta: ");
        int nconta = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite os debitos de sua conta");
        double debito = scanner.nextDouble();

        System.out.println("Digite o credito de sua conta ");
        double credito = scanner.nextDouble();

        double saldoatual = saldo - debito + credito;
        System.out.println(" ===================================");
        System.out.println("Potador da conta: "+ nconta);
        System.out.println("Saldo atual: R$ " + saldoatual);

        String mensagem = (saldoatual >=0) ? "Saldo positivo!" : "Saldo negativo";
        System.out.println(mensagem);
    }
}
