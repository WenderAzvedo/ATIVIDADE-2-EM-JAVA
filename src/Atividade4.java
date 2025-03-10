import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pontuação do aço");

        System.out.println("Digite a dureza do carvão: ");
        double dureza = scanner.nextDouble();

        System.out.println("Digite o teor do carvão: ");
        double teor = scanner.nextDouble();

        System.out.println(" Digite a resistencia do carvão: ");
        double resistencia = scanner.nextDouble();

        if (dureza > 50 && teor < 0.7 && resistencia > 5600){

            System.out.println("Pontuação é 10 todas as condições foram cumpridas!");

        } else if (dureza > 50 && teor < 0.7) {

            System.out.println("Pontuação é 9 Dureza e teor de carvão foram cumpridas!");

        } else if (teor <0.7 && resistencia > 5600) {

            System.out.println("Pontuação é 8 teor e resistencia a tração foram cumpridas!");

        } else if (dureza > 50 && resistencia > 5600) {

            System.out.println("Pontuação é 7 dureza e resistencia a tração foram cumpridas!");

        } else if (dureza > 50 || teor < 0.7 || resistencia > 5600) {

            System.out.println("Pontuação é 6 somente uma condição foi cumprida!");

        } else {

            System.out.println("Pontuação é 5 nenhuma das condições são cumpridas");

        }

        scanner.close();
    }
}
