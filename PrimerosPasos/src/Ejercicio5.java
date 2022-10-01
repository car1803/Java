import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,nota_final;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nota de participacion?:");
		nota1 = entrada.nextFloat();
		System.out.println("Nota del primer parcial?:");
		nota2 = entrada.nextFloat();
		System.out.println("Nota del segundo parcial?:");
		nota3 = entrada.nextFloat();
		System.out.println("Nota del tercer parcial?");
		nota4 = entrada.nextFloat();
		nota_final = (nota1*0.1f)+(nota2*0.25f)+(nota3*0.25f)+(nota4*0.4f);
		System.out.println("la nota final es de:"+nota_final);
	}

}
