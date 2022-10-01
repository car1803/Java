package ciclos;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int s=0,n;
		do {
			System.out.println("digite un numero");
			n = entrada.nextInt();
			s+=n;
		} while(n!=0);
		System.out.println("el numero es"+s);
	}
}
