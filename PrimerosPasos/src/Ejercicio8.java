import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
		float a,b,c,x1,x2,raiz;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite el primer termino: ");
		a = entrada.nextFloat();
		System.out.println("digite el segundo termino: ");
		b = entrada.nextFloat();
		System.out.println("digite el tercer termino: ");
		c = entrada.nextFloat();
		raiz = (float) Math.sqrt((double)(Math.pow(b, 2)-(4*a*c)));
		x1 = (-b+raiz)/(2*a);
		x2 = (-b-raiz)/(2*a);
		System.out.println("las raices son: "+x1+" "+x2);
	}
}
