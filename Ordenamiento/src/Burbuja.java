import java.util.Scanner;

//revisa cada elemento con el siguiente
public class Burbuja {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
	int arreglo[],elementos,aux;
	System.out.println("numero de elemntos");
	elementos=entrada.nextInt();
	arreglo = new int[elementos];
	System.out.println("llene el arreglo");
	for(int i=0;i<elementos;i++) {
		arreglo[i]=entrada.nextInt();
	}
	for(int i=0;i<elementos-1;i++) {
		for(int j=0;j<elementos-1;j++) {
			if(arreglo[j]>arreglo[j+1]) {
				aux=arreglo[j];
				arreglo[j]=arreglo[j+1];
				arreglo[j+1]=aux;
			}
		}
	}
	for(int i=0;i<elementos;i++) {
		System.out.println(arreglo[i]);
	}
	}
}
