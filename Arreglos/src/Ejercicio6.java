
import java.util.Scanner;
//mescla dos arreglos interaciones de 3 en 3
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz1 = new int[12];
		int[] matriz2 = new int[12];
		int[] matriz3 = new int[24];
		System.out.println("digite doce numeros tabla1");
		for (int i=0;i<12;i++) {
			matriz1[i] = entrada.nextInt();
		}
		System.out.println("digite doce numeros tabla2");
		for (int i=0;i<12;i++) {
			matriz2[i] = entrada.nextInt();
		}
		int n1=0,n2=0,c1=0,c2=0;
		for (int i=0;i<24;i++) {
			if (c1<3) {
				matriz3[i] = matriz1[n1];	
				n1+=1;
				c1+=1;
				if (c1 == 3) {
					c2=0;
				}
			}
			else if(c2<3) {
				matriz3[i] = matriz2[n2];
				n2+=1;
				c2+=1;
				if (c2 == 3) {
					c1=0;
				}
			}
		}
		for (int i=0;i<24;i++) {
			System.out.println(matriz3[i]);
		}
	}

}

