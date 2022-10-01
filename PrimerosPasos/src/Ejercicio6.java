import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int a,b,res;
		System.out.print("digite en primer numero: ");
		a = entrada.nextInt();
		System.out.print("digite el segundo numero: ");
		b = entrada.nextInt();
		res = (int) (Math.pow(a,2)+(2*a*b)+Math.pow(b,2));
		System.out.print("La respuesta es: "+res);
	}
}
