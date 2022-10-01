package ciclos;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,c=1;
		n = entrada.nextInt();
		while(n >= 0) {
			c+=1;
			n = entrada.nextInt();
		}
		System.out.println("el numero de numeros ingresados es de"+c);
	}
}
