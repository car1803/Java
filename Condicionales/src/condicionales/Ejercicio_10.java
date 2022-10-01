package condicionales;
import java.util.Scanner;
public class Ejercicio_10{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese cantidad de kg");
		float valor = entrada.nextInt();
		System.out.println("Digite unidad a convertir \n1.miligramo(mg)\n2.centigramo(cg)\n3.decigramo(dg)\n4.gramo(g)\n5.decagramo(dag)\n6.hectogramo(hg)\n7.miriagramo(mag)\n8.quintal(q)\n9.tonelada(t)");
		String pal = entrada.next();
		switch (pal) {
			case "mg": System.out.println("El valor en mg es: "+(valor*Math.pow(10,6)));
				break;
			case "cg": System.out.println("El valor en cg es: "+(valor*Math.pow(10,5)));
				break;
			case "dg": System.out.println("El valor en dg es: "+(valor*Math.pow(10,4)));
				break;
			case "g": System.out.println("El valor en g es: "+(valor*Math.pow(10,3)));
				break;
			case "dag": System.out.println("El valor en dag es: "+(valor*Math.pow(10,2)));
				break;
			case "hg": System.out.println("El valor en hg es: "+(valor*Math.pow(10,1)));
				break;
			case "mag":System.out.println("El valor en mag es: "+(valor/Math.pow(10,1)));
				break;
			case "q": System.out.println("El valor en q es: "+(valor/Math.pow(10,2)));
				break;
			case "t": System.out.println("El valor en t es: "+(valor/Math.pow(10,3)));
				break;
			default: System.out.println("Unidad no encontrada");
				break;
		}

	}
}