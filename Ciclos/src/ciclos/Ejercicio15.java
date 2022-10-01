package ciclos;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad,sedad=0,c1=0,c2=0;
		float altura,saltura=0;
		for (int i=1;i<=5;i++) {
			System.out.println("Digite la edad y la altura del estudiante "+i);
			edad = entrada.nextInt();
			altura = entrada.nextFloat();
			sedad+=edad;
			saltura+=altura;
			if (edad>18) {
				c1+=1;
			}
			if (altura>1.75) {
				c2+=1;
			}
		}
		System.out.println("la edad promedio es de: "+(float)sedad/5);
		System.out.println("la estatura promedio es de: "+(float)saltura/5);
		System.out.println("la cantidad de estudiantes mayores a 18 años es de: "+c1);
		System.out.println("la cantidad de estudiantes miden mas de 1.75 es de:"+c2);
	}
}
