//disminuya en un el orden del arreglo
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int[] matriz = new int[10];
		System.out.println("digite diez numeros");
		for (int i=0;i<10;i++) {
			matriz[i]=entrada.nextInt();
		}
		int ultimo = matriz[9];
		for (int i=8;i>=0;i--) {
			matriz[i+1]=matriz[i]; //avansa el arreglo en 1
		}
		matriz[0]=ultimo;
		System.out.println("el nuevo arreglo es");
		for(int i=0;i<10;i++) {
			System.out.println(matriz[i]);
		}
	}
}
