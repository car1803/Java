import java.util.Scanner;

//leer un arrglo, guardar en uno los elemento pares y en otro los elementos impares

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int pares=0,impares=0;
		System.out.println("llenar el arreglo");
		for(int i=0;i<10;i++) {
			arreglo[i]=entrada.nextInt();
			if(arreglo[i]%2==0) {
				pares+=1;
			}
			else {
				impares+=1;
			}
		}
		int[] Apares = new int[pares];
		int[] Aimpares = new int[impares];
		pares=0;impares=0;
		for(int i=0;i<10;i++) {
			if(arreglo[i]%2==0) {
				Apares[pares]=arreglo[i];
				pares+=1;
			}else {
				Aimpares[impares]=arreglo[i];
				impares+=1;
			}
		}
		System.out.println("el arreglo par es:");
		for(int i = 0;i<pares;i++) {
			System.out.println(Apares[i]);
		}
		System.out.println("el arreglo impar es:");
		for(int i = 0;i<impares;i++) {
			System.out.println(Aimpares[i]);
		}
	}

}
