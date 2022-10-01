package ciclos;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		n = entrada.nextInt();
		while(n !=0) {
			if (n%2==0) {
				System.out.println("el numero es par");
			} else {
				System.out.println("el numero es impar");
			}
			n = entrada.nextInt();
		}
	}
}
