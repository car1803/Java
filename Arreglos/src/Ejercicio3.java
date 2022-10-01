import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] matriz = new int[5];
		float mp=0,c1=0,mn=0,c2=0,nc=0;
		System.out.println("digite cinco numeros");
		for (int i=0;i<5;i++) {
			matriz[i] = entrada.nextInt();
			if (matriz[i]>0) {
				mp+=matriz[i];
				c1+=1;
			}
			else if (matriz[i]<0) {
				mn+=matriz[i];
				c2+=1;
			}
			else {
				nc+=1;
			}
		}
		System.out.println("la media de los positivos es:"+(mp/c1)+"\nla media de los negativoses:"+(mn/c2)+"\nel numero de c:"+nc);
	}

}