
//sumar dos marices de 3x3
import java.util.Scanner;
public class MEjercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] matriz3 = new int[3][3];
		System.out.println("llenado de numeros1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz1[i][j]=entrada.nextInt();
			}
		}
		System.out.println("llenado de numeros2");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz2[i][j]=entrada.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz3[i][j]+" ");
			}
			System.out.println();
		}
	}
}