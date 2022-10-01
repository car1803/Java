package ciclos;
import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota;
		int c1=0,c2=0,c3=0;
		for (int i=1;i<=6;i++) {
			do {
				System.out.println("digite nota");
				nota = entrada.nextFloat();
			} while(nota<0 || nota>10);
			if (nota == 4) {
				c1+=1;
			}
			else if (nota>=5) {
				c2++;
			}
			else {
				c3++;
			}
		}
		System.out.println("aprobados "+c1+"\ncondicionado "+c2+"\nsuspendido "+c3);
	}
}
