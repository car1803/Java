package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("digite una letra");
		Scanner entrada = new Scanner(System.in);
		char letra = entrada.next().charAt(0);
		if (Character.isUpperCase(letra)) {
			System.out.println("Es una letra mayuscula");
		}
		else {
			System.out.println("Es una letra minuscula");
		}
	}

}
