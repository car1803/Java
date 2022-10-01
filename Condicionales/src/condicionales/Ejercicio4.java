package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cual fue el valor de su compra?: ");
		float valor = entrada.nextFloat();
		if (valor > 300) {
			System.out.println("El valor de su compra es de "+(valor-(valor*0.2)));
		}
		else {
			System.out.println("El valor de su compra es de"+(valor));			
		}
	}

}
