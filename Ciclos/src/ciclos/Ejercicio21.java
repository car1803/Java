package ciclos;
import java.util.Scanner;
public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,c=0;
		for (int i=1;i<=10;i++) {
			System.out.println("digite un numero");
			n = entrada.nextInt();
			if (n<0) {
				c+=1;
			}
		}
		System.out.println("el numero de negativos es: "+c);
	}
}
