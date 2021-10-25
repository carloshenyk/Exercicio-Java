/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 
 * até X, um valor por linha, inclusive o 
X, se for o caso.*/


package exercicio_de_repeticao;
import java.util.Scanner;


public class EstruturaFOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um Valor: ");
		
		int X = sc.nextInt();
		
		for(int i=0; i<X; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
