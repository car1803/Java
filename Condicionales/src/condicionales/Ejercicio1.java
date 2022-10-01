package condicionales;

import java.util.Scanner;

public class Ejercicio1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		if (numero % 10 == 0) {
			System.out.println("El numero es multiplo de 10");
		} else {
			System.out.println("El numero no es multiplo de 10");
		}
	}
}