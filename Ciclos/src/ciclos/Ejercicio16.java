package ciclos;
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		do {
			System.out.println("de un numero entre 0 y 10");
			n = entrada.nextInt();
		}while(n<0 || n>10);

		for (int i=1;i<11;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}
