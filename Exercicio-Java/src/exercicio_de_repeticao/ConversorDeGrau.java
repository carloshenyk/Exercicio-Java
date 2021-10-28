package exercicio_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDeGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		char respo;
		System.out.println("Programa para converter grau Célsius para Fahrenheit");
		System.out.println("====================================================");
		
		do {
			System.out.print("Digite a temperatura em Célsius: ");
			double celsius = sc.nextDouble();
			double fahren = 9.0 * celsius / 5.0 +32.0;
			System.out.printf("Equivalente em Fahrenheit %.1f%n", fahren);
			System.out.print("Deseja fazer nova Conversão (s/n)? ");
			respo = sc.next().charAt(0);
		}while(respo != 'n');

	}

}
