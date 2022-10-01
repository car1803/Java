package ciclos;
import java.util.Scanner;
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo_art,cantven,clv1=0,c=0;
		double ppl=0,fft=0;
		for (int i=1;i<6;i++){
			System.out.println("digite el codigo del articulo "+i);
			codigo_art = entrada.nextInt();
			System.out.println("cantidad vendida en litros del articulo"+i);
			cantven = entrada.nextInt();
			if (codigo_art==1) {
				ppl = 0.6;
			}
			else if (codigo_art==2) {
				ppl = 3;
			}
			else if (codigo_art==3){
				ppl = 1.25;
			}
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
