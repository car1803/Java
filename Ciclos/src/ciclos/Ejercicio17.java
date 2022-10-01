package ciclos;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo_art,cantven,clv1=0,c=0;
		float ppl,fft=0;
		for (int i=1;i<6;i++){
			System.out.println("digite el codigo del articulo "+i);
			codigo_art = entrada.nextInt();
			System.out.println("cantidad vendida en litros del articulo"+i);
			cantven = entrada.nextInt();
			System.out.println("precio por litro del articulo"+i);
			ppl = entrada.nextFloat();
			fft+=(cantven*ppl);
			if (codigo_art==1) {
				clv1 += cantven;
			}
			if ((cantven*ppl)>600) {
				c+=1;
			}
		}
		System.out.println("facturacion total "+fft);
		System.out.println("cantidda vendida en litros de 1 "+clv1);
		System.out.println("facturas suepiores a 600l "+c);
	}
}
