package ciclos;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite un numero");
		int n,s=0,c=0;
		float media;
		n = entrada.nextInt();
		while(n>=0) {
			c+=1;s+=n;
			System.out.println("digite otro numero");
			n=entrada.nextInt();
		}
		if (c==0) {
			System.out.println("no se puede dividir por cero");
		}
		else {
			System.out.println("la media es "+ (float)s/c);
		}
	}
}