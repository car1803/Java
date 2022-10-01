package ciclos;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int s=0;
		for(int i=1;i<11;i++) {
			System.out.println("digite el "+i+" numero");
			s+=entrada.nextInt();
		}
		System.out.println("la suma total es de "+s);
	}
}
