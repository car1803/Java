//insertar 5 numeros ordenados de forma creciente
//insertar otros 5 numeros de modo que el arreglo este de forma creciente
import java.util.Scanner;

public class Ejercicio11{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		boolean creciente = true;
		int numero,posicion=0,j=0;
		System.out.println("llene el arreglo");
		do {
			for(int i=0;i<5;i++) {
				arreglo[i]=entrada.nextInt();
			}
			for(int i=0;i<4;i++) {
				if(arreglo[i]<arreglo[i+1]) {
					creciente=true;
				}
				if(arreglo[i]>arreglo[i+1]) {
					creciente=false;
					break;
				}
			}
			if(creciente == false) {
				System.out.println("el arreglo no es creciente");
				
			}
		}while(creciente==false);
		//digitamos un numero y encontramos su posiciocn
		System.out.println("digite un elemento a inseratar");
		numero = entrada.nextInt();
		while(arreglo[j]<numero && j<5) {
			posicion++;
			j++;
		}
		//desplazamos los numeros
		for(int i=4;i>=posicion;i--) {
			arreglo[i+1]=arreglo[i];
		}
		arreglo[posicion]=numero;
		System.out.println("arreglo final");
		for(int i=0;i<6;i++) {
			System.out.println(arreglo[i]);
		}
		
	}
}