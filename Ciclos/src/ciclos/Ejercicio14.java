package ciclos;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float sueldo,suma=0;
		int c=0;
		for (int i=0;i<10;i++) {
			sueldo = entrada.nextFloat();
			suma+=sueldo;
			if(sueldo>1000) {
				c+=1;
			}
		}
		System.out.println("la suma de los sueldo es de: "+suma);
		System.out.println("la cantidad de sueldo superiores a 1000 son: "+c);
	}
}
