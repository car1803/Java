package condicionales;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite un numero: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite otro numero: ");
		int n2 = entrada.nextInt();
		if (n1 > n2) {
			System.out.println("El primer numero es mayor");
		}
		else if(n2 > n1) {
			System.out.println("El segundo numero es mayor");
		}
		else {
			System.out.println("Los numeros son iguales");
		}
	}

}
