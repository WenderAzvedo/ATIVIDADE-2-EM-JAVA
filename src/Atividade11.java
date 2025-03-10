import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros para saber se eles formam um triangulo!");

        System.out.println("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.println("Digite o valor de Y:");
        double y = scanner.nextDouble();

        System.out.println("Digite o valor de Z");
        double z = scanner.nextDouble();

        if (x < y + z && y < x + z && z < x +y) {

            if (x == y && y == z){

                System.out.println("========================================");
                System.out.println("X, Y E Z FORMAM UM TRIANGULO EQUILATERO");
                System.out.println("========================================");

            } else if (x == y || x == z || y == z) {

                System.out.println("========================================");
                System.out.println("X, Y E Z FORMAM UM TRIANGULO ISOSCELES");
                System.out.println("========================================");

            } else {

                System.out.println("========================================");
                System.out.println("X, Y E Z FORMAM UM TRIANGULO ESCALENO ");
                System.out.println("========================================");

            }
        }else {

            System.out.println("========================================");
            System.out.println("NÃO FORMA UM TRIANGULO ");
            System.out.println("========================================");

        }

    }
}
