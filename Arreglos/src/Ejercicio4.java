import java.util.Scanner;
public class Ejercicio4 {
	//imprime al inicio-ultimo-segundo-penultimo...
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz = new int[10];
		System.out.println("digite diez numeros");
		for (int i=0;i<10;i++) {
			matriz[i] = entrada.nextInt();
		}
		int n1=9,n2=0;
		boolean c = true;
		for (int i=0;i<10;i++) {
			if (c) {
				System.out.println(matriz[n2]);
				n2+=1;
				c = false;
			}
			else {
				System.out.println(matriz[n1]);
				c=true;
				n1-=1;
			}
		}
	}
}