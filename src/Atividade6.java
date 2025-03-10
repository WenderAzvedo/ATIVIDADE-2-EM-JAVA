import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {

            System.out.println("segundo a legislação brasileira voce e maior de idade!");

        } else {

            System.out.println("segundo a legislação brasileira voce ainda e menor de idade!");

        }
    }
}

//import java.util.Scanner;
//public class teste {
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Qual a sua idade?: ");
//            int idade = scanner.nextInt();
//
//
//            String mensagem = idade >=18 ? "Voce e maior de idade!" : "Voce e menor de idade!";
//            System.out.println(mensagem);
//        }
//    }

