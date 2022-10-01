import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuando dinero tiene guillermo?");
		float guillermo = entrada.nextFloat();
		float luis = guillermo/2;
		float juan = (guillermo+luis)/2;
		System.out.println("La cantidad de dinero que tienen entre los tres es de "+(guillermo+luis+juan));
	}
}
