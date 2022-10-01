package ciclos;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota;
		boolean s = false;
		for (int i=1;i<=5;i++) {
			System.out.println("digite nota");
			nota = entrada.nextFloat();
			if (nota<5) {
				s = true;
			}
		}
		System.out.println("hay reprobados? "+s);
	}
}
