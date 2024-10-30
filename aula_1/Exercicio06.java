package aula_1;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o total de compras: R$ ");
		        double totalCompras = scanner.nextDouble();
		        scanner.nextLine(); 

		        System.out.print("Digite o cupom: ");
		        String cupom = scanner.nextLine();

		        double desconto = 0;

		        if (totalCompras > 500 || cupom.equals("DESCONTO10")) {
		            desconto = totalCompras * 0.10; 
		        }

		        double totalFinal = totalCompras - desconto;

		        System.out.printf("Total de compras: R$ %.2f%n", totalCompras);
		        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
		        System.out.printf("Total a pagar: R$ %.2f%n", totalFinal);

		        scanner.close();
	}
}