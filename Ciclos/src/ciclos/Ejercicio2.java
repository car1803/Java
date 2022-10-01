package ciclos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		n = entrada.nextInt();
		while(n !=0) {
			if (n >0) {
				System.out.println("el numero es positivo");
			} else {
				System.out.println("el numero es negativo");
			}
			n = entrada.nextInt();
		}
	}
}
