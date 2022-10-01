import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int arreglo1[] = new int[10];
		int arreglo2[] = new int[10];
		int arreglo3[] = new int[20];
		boolean creciente1 = true, creciente2 = true;
		int c1=0,c2=0;
		do {
			System.out.println("llene el arreglo 1");
			for(int i=0;i<10;i++) {
				arreglo1[i]=entrada.nextInt();
			}
			for(int i=0;i<8;i++) {
				if(arreglo1[i]<arreglo1[i+1]) {
					creciente1=true;
				}
				if(arreglo1[i]>arreglo1[i+1]) {
					creciente1=false;
					System.out.println("arreglo 1 no es creciente");
					break;
				}
			}
		}while(creciente1==false);
		
		do {
			System.out.println("llene el arreglo 2");
			for(int i=0;i<10;i++) {
				arreglo2[i]=entrada.nextInt();
			}
			for(int i=0;i<8;i++) {
				if(arreglo2[i]<arreglo2[i+1]) {
					creciente2=true;
				}
				if(arreglo2[i]>arreglo2[i+1]) {
					creciente2=false;
					System.out.println("arreglo 2 no es creciente");
					break;
				}
			}
		}while(creciente2==false);
		
		for(int i=0;i<20;i++) {
			if (arreglo1[c1]<=arreglo2[c2]) {
				arreglo3[i]=arreglo1[c1];
				c1+=1;
			}else {
				arreglo3[i]=arreglo2[c2];
				c2+=1;
			}
			if (c1==10) {
				c1=9;
			}
			if (c2==10) {
				c2=9;
			}
		}
		System.out.println("el arreglo final es");
		for(int i=0;i<20;i++) {
			System.out.println(arreglo3[i]);
		}
		
	}
}
