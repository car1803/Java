//mostrar si un arrglo esta ordendo de forma, creciente, decreciente, desordenado o igual.
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[] = new int[10];
		boolean menor=false,mayor=false;
		System.out.println("digite 10 numeros");
		for (int i=0;i<10;i++) {
			matriz[i]=entrada.nextInt();
		}
		for (int i=0;i<9;i++) {
			if (matriz[i] < matriz[i+1]) {
				mayor = true;
			}
			else if (matriz[i] > matriz[i+1]) {
				menor = true;
			}
		}
		if (menor==true && mayor==false) {
			System.out.println("los datos estan ordenados de forma decreciente");
		}
		else if (mayor==true && menor==false) {
			System.out.println("los datos estan ordenados de forma creciente");
		}
		else if (menor==false && mayor==false) {
			System.out.println("los datos son iguales");
		}
		else if (menor==true && mayor==true){
			System.out.println("datos desordenados");
		}
	}
}
