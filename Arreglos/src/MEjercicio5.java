
//cargar una matriz y sumar filas y columnas
import java.util.Scanner;
public class MEjercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz;
		int columnas, filas;
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
		//imprimir matriz
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		//suamr filas
		int sumf;
		for(int i=0;i<filas;i++) {
			sumf=0;
			for(int j=0;j<columnas;j++) {
				sumf+=matriz[i][j];
			}
			System.out.println("la suma de la fila"+i+"es: "+sumf);
		}
		//sumar columans
		//suamr filas
		int sumc=0;
		for(int j=0;j<columnas;j++) {
			sumc=0;
			for(int i=0;i<filas;i++) {
				sumc+=matriz[i][j];
			}
			System.out.println("la suma de la columna"+j+"es: "+sumc);
		}
	}
}
