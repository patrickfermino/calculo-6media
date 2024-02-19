import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Qual a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;
        System.out.println("A media das nota é: " +  media);


    }
    }