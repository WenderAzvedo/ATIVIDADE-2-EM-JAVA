import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A unidade da maça custa R$ 1.30. A partir de 12 a unidade sai por R$ 1,00 cada!");

        System.out.print("Digite a quantidade de maçãs que deseja: ");
        int unidade = scanner.nextInt();

        double precototal = unidade * (unidade >=12 ? 1.00 : 1.30);

        System.out.println("O preco total e: " + precototal);
    }
}

// Quando há apenas duas opções o melhor e usar operador ternario. Asssim facilitando o intendimento do codigo e deixando mais limpo.
