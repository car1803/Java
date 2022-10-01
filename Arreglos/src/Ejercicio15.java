//buscar un numero en una lista
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		boolean creciente = true;
		int numero;
		System.out.println("llene el arreglo");
		do {
			for(int i=0;i<10;i++) {
				arreglo[i]=entrada.nextInt();
			}
			for(int i=0;i<9;i++) {
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
		System.out.println("digite un elemento");
		numero = entrada.nextInt();
		int i=0;
		while(i<10 && arreglo[i]<numero) {
			i++;
		}
		if(i==10) {
			System.out.println("numero no encontrado");
		}else {
			if(arreglo[i]==numero) {
				System.out.println("numero encontrado en la posicion "+i);
			}
			else {
				System.out.println("numero no encontrado");
			}
		}
	}
}
