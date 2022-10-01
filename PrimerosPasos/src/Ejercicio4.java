import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float salario = 1000, V_venta;
		System.out.println("Cuantos autos vendio el vendedor?");
		int N_autos = entrada.nextInt();
		salario += (150*N_autos);
		for (int i=0; i<N_autos; i++){
			System.out.println("Valor de venta del auto"+i);
			 V_venta = entrada.nextFloat();
			 salario += (V_venta*0.05);
		}
		System.out.print("El salario del empleado es de"+salario);
	}
}
