import java.util.Scanner;

//busqueda del numero
public class Busqueda {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
	int arreglo[],elementos,dato;
	System.out.println("numero de elemntos");
	elementos=entrada.nextInt();
	arreglo = new int[elementos];
	System.out.println("llene el arreglo");
	for(int i=0;i<elementos;i++) {
		arreglo[i]=entrada.nextInt();
	}
	System.out.println("Numero a buscar");
	dato=entrada.nextInt();
	int i=0;
	boolean band=false;
	while((i<elementos)&&(band==false)){
		if(arreglo[i]==dato) {
			band=true;
		}
		i++;
	}
	if(band==false) {
		System.out.println("el valor no se encuentra");
	}else {
		System.out.println("el numero fue encontrada en la posicion"+(i-1));
	}
	}
}