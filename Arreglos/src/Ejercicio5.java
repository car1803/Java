
import java.util.Scanner;
//mescla dos arreglos
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz1 = new int[10];
		int[] matriz2 = new int[10];
		int[] matriz3 = new int[20];
		System.out.println("digite diez numeros tabla1");
		for (int i=0;i<10;i++) {
			matriz1[i] = entrada.nextInt();
		}
		System.out.println("digite diez numeros tabla2");
		for (int i=0;i<10;i++) {
			matriz2[i] = entrada.nextInt();
		}
		int n1=0,n2=0;
		for (int i=0;i<20;i++) {
			if (i%2==0) {
				matriz3[i] = matriz1[n1];	
				n1+=1;
			}
			else {
				matriz3[i] = matriz2[n2];
				n2+=1;
			}
		}
		for (int i=0;i<20;i++) {
			System.out.println(matriz3[i]);
		}
	}

}