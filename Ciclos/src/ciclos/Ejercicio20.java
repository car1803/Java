package ciclos;
import java.util.Scanner;
//numero mayor de una lista
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		float sueldo,sueldomax=0;
		for (int i=1;i<=N;i++){
			System.out.println("digite un sueldo: ");
			sueldo = entrada.nextFloat();
			if (i==1) {
				sueldomax=sueldo;
			}else {
				if(sueldo>=sueldomax) {
					sueldomax=sueldo;
				}
			}
		}
		System.out.println("el sueldo mayor es: "+sueldomax);
	}
}
