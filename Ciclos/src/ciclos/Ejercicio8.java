package ciclos;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite un numero");
		int N = entrada.nextInt();
		for (int i=1;i<=N;i++) {
			System.out.println(i);
		}
	}
}
