//crear una matriz y transponerla
import java.util.Scanner;
public class MEjercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		System.out.println("llenado de numeros");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=entrada.nextInt();
			}
		}
		System.out.println("matrix original");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		//transponerla
		int aux;
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
				aux=matriz[i][j];
				matriz[i][j]=matriz[j][i];
				matriz[j][i]=aux;
			}
		}
		System.out.println("matrix transpuesta");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}