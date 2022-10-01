import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz = new int[5];
		System.out.println("digite cinco numeros");
		for (int i=0;i<5;i++) {
			matriz[i] = entrada.nextInt();
		}
		for (int i=0;i<5;i++) {
			System.out.println(matriz[i]);
		}
	}

}
