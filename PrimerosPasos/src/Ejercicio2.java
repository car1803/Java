import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nCual es su salario por hora?: ");
		float salario = entrada.nextFloat();
		System.out.println("Cuantas horas trabajo esta semana?: ");
		int horas = entrada.nextInt();
		System.out.println("Su salario es de: "+(salario*horas));
	}
}