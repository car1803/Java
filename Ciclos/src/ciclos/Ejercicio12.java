package ciclos;

import java.util.Scanner;
//factorial
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("de un numero ");
		int N = entrada.nextInt();
		long fact = 1;
		for (int i=1;i<=N;i++) {
			fact*=i;
		}
		System.out.println("el factorial es: "+fact);
	}

}
