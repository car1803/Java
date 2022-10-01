package ciclos;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n,nc=0,nn=0,np=0,sn=0,sp=0;
		for (int i=0;i<10;i++) {
			System.out.println("digite un numero");
			n=entrada.nextInt();
			if (n<0) {
				nn += 1;sn += n;
			}
			else if (n>0) {
				np +=1;sp += n;
			}
			else {
				nc+=1;
			}
		}
		if (nn != 0 && np != 0) { 
			System.out.println("media de positivos "+(float)sp/np);
			System.out.println("media de negativos "+(float)sn/nn);
			System.out.println("numero de ceros "+nc);
		}
	}
}
