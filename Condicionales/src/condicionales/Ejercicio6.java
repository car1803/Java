package condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1,n2;
		System.out.println("digite numero 1: ");
		n1 = entrada.nextInt();
		System.out.println("digite numero 2: ");
		n2 = entrada.nextInt();
		if ((n1%2 == 0)&&(n2%2 == 0)) {
			System.out.println("ambos numeros son pares");
		}
		else if ((n1%2 == 1)&&(n2%2 == 1)) {
			System.out.println("ambos numeros son impares");
		}
		else {
			System.out.println("uno es par y el otro impar");
		}
	}

}
