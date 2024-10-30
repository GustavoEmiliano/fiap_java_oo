package aula_1;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do primeiro metal: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite o peso do segundo metal: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite o peso do terceiro metal: ");
        double peso3 = scanner.nextDouble();

        double maisPesado = peso1;

        if (peso2 > maisPesado) {
            maisPesado = peso2;
        }
        if (peso3 > maisPesado) {
            maisPesado = peso3;
        }

        System.out.println("O metal mais pesado pesa: " + maisPesado);
        scanner.close();
    }
}