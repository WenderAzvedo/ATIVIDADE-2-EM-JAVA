import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade para saber sua categoria");

        System.out.println("Qual a sua idade?: ");
        int idade = scanner.nextInt();

        if (idade <=7){

            System.out.println("Voce tem " + idade + " anos. Sua categoria e INFANTIL!");

        }else if (idade <= 10){

            System.out.println("Voce tem " + idade + " anos. Sua categoria e JUVENIL!");

        } else if (idade <=15 ) {

            System.out.println("Voce tem " + idade + " anos. Sua categoria e ADOLESCENTE!");

        } else if (idade <= 30) {

            System.out.println("Voce tem " + idade + " anos. Sua categoria e ADULTO!");

        }else {

            System.out.println("Voce tem " + idade + ". Sua categoria e SENIOR!");

        }
    }
}
