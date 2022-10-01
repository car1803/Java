package condicionales;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("cuantas horas trabajo esta semana?: ");
		int horas = entrada.nextInt();
		int salario;
		if (horas <= 40) {
			salario = (16*horas);
		}
		else {
			salario=(16*40)+(20*(horas-40));
		}
		System.out.println("Su salario es de: "+salario);
	}
}
