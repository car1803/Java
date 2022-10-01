//digita una matrix nxm y saber si es simetrica, cuadrada y igual a su transpuesta
import java.util.Scanner;
public class MEjercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz;
		int columnas, filas;
		boolean simetrica=true;
		System.out.println("digite numero de filas:");
		filas = entrada.nextInt();
		System.out.println("digite numero de columnas:");
		columnas = entrada.nextInt();
		matriz= new int[filas][columnas];
		System.out.println("llenado de numeros");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz[i][j]=entrada.nextInt();
			}
		}
		if(filas==columnas) {
			int i,j;
			i=0;
			while(i<filas && simetrica==true) {
				j=0;
				while(j<i && simetrica==true) {
					if(matriz[i][j]!=matriz[j][i]) {
						simetrica=false;
					}
					j++;
				}
				i++;
			}
			if(simetrica==true) {
				System.out.println("la matriz es simetrica");
			}else {
				System.out.println("la matriz no es simetrica");
			}
		}
		else {
			System.out.println("la matriz no es simetrica");
		}
	}
}
