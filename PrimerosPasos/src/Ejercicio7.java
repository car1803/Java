import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		int horas_t, semanas, dias;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite el numero de horas: ");
		horas_t = entrada.nextInt();
		semanas = horas_t/168;
		horas_t-=(168*semanas);
		dias = horas_t/24;
		horas_t-=(24*dias);
		System.out.println("Semanas: "+semanas+",dias: "+dias+",horas: "+horas_t);
	}
}
