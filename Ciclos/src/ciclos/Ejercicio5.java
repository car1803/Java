package ciclos;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aleatorio, n, c=1;
		aleatorio = (int) (Math.random()*100);
		System.out.println("digite un numero");
		n = entrada.nextInt();
		while ( n!=aleatorio) {
			if (n<aleatorio) {
				System.out.println("el numero es mayor");
			}
			else {
				System.out.println("el numero es menor");
			}
			System.out.println("digite un numero");
			n = entrada.nextInt();
			c+=1;
		}
		System.out.println("numero encontrado, numero de intentos"+c);
	}
}
