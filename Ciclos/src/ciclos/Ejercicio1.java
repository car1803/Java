package ciclos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int n; 
	n = entrada.nextInt();
	while (n>=0) {
		System.out.println((int) Math.pow(n,2));
		n = entrada.nextInt();
	}
}
}
