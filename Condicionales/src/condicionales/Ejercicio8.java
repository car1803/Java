package condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite un numero entre 0 y 99999");
		int n = entrada.nextInt();
		if (n < 10) {
			System.out.println("el numero tiene una cifra");
		}
		else if (n < 100) {
			System.out.println("el numero tiene dos cifras");
		}
		else if (n < 1000) {
			System.out.println("el numero tiene tres cifras");
		}
		else if (n < 10000) {
			System.out.println("el numero tiene cuatro cifras");
		}
		else if (n < 100000) {
			System.out.println("el numero tiene cinco cifras");
		}
	}
}
