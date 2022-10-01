import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
		float[] trimestre1 = new float[5];
		float[] trimestre2 = new float[5];
		float[] trimestre3 = new float[5];
		int estudiante;
		Scanner entrada = new Scanner(System.in);
		System.out.println("notas del primer trimestre");
		for(int i=0;i<5;i++) {
			trimestre1[i]=entrada.nextFloat();
		}
		System.out.println("notas del segundo trimestre");
		for(int i=0;i<5;i++) {
			trimestre2[i]=entrada.nextFloat();
		}
		System.out.println("notas del tercer trimestre");
		for(int i=0;i<5;i++) {
			trimestre3[i]=entrada.nextFloat();
		}
		float s1=0,s2=0,s3=0;
		for(int i=0;i<5;i++) {
			s1+=trimestre1[i];
			s2+=trimestre2[i];
			s3+=trimestre3[i];
		}
		System.out.println("la media del grupo en el primer trimestr es de: "+(s1/5));
		System.out.println("la media del grupo en el segundo trimestr es de: "+(s2/5));
		System.out.println("la media del grupo en; el tercer trimestr es de: "+(s3/5));
		System.out.println("digite el estudiante");
		estudiante = entrada.nextInt();
		System.out.println("el promedio del estudinte es de:"+((trimestre1[estudiante-1])+(trimestre2[estudiante-1])+(trimestre3[estudiante-1]))/3);        
	}
}
