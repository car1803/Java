//eliminar un numero de una posicion
import java.util.Scanner;

public class Ejercicio12{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int posicion=0;

		System.out.println("llene el arreglo");
		for(int i=0;i<10;i++) {
			arreglo[i]=entrada.nextInt();
		}
		//digitamos un numero y encontramos su posiciocn
		do {
			System.out.println("digite la posicion del elemento a eliminar");
			posicion = entrada.nextInt();
			posicion -=1;
			if (0>posicion || posicion>9) {
				System.out.println("entrada no valida");
			}
		}while(0>posicion || posicion>9);
		//dezplasa los numeros
		for(int i=(posicion-1);i<9;i++) {
			arreglo[i]=arreglo[i+1];
		}
		arreglo[9]=0;
		System.out.println("arreglo final");
		for(int i=0;i<9;i++) {
			System.out.println(arreglo[i]);
		}
		
	}
}