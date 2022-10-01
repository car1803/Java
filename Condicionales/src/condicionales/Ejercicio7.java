package condicionales;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite un numero: ");
		int n1 = entrada.nextInt();
		System.out.println("digite un numero: ");
		int n2 = entrada.nextInt();
		System.out.println("digite un numero: ");
		int n3 = entrada.nextInt();
		if ((n1>n2)&&(n2>n3)) {
			System.out.println(n1+"-"+n2+"-"+n3);
		}
		else if ((n1>n3)&&(n3>n2)) {
			System.out.println(n1+"-"+n3+"-"+n2);
		}
		else if ((n2>n1)&&(n1>n3)) {
			System.out.println(n2+"-"+n1+"-"+n3);
		}
		else if ((n2>n3)&&(n3>n1)) {
			System.out.println(n2+"-"+n3+"-"+n1);
		}		
		else if ((n3>n1)&&(n1>n2)) {
			System.out.println(n3+"-"+n1+"-"+n2);
		}		
		else if ((n3>n2)&&(n2>n1)) {
			System.out.println(n3+"-"+n2+"-"+n1);
		}		
	}
}
