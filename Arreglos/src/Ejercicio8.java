//insertar numeros en un arreglo
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz = new int[10];
		System.out.println("digite 8 numeros");
		for (int i=0;i<8;i++) {
			matriz[i]=entrada.nextInt();
		}
		int pos,n,c=7;
		for (int i=1;i<3;i++) {
			System.out.print("digite una posicon: ");
			pos=entrada.nextInt();
			System.out.print("digite una numero: ");
			n=entrada.nextInt();
		
			for (int j=c;j>=(pos-1);j--) {
				matriz[j+1]=matriz[j]; //avansa el arreglo en 1
			}
			c+=1;
			matriz[(pos-1)]=n;
		}
		System.out.println("nuevo arreglo");
		for (int i=0;i<10;i++) {
			System.out.println(matriz[i]);
		}
	}
}
