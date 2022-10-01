package ciclos;

public class Ejercicio11 {
	public static void main(String[] args) {
		int n=1; long p=1;
		for (int i=1;i<11;i++) {
			p *= n; n+=2; 
		}
		System.out.println("el producto es "+ p);
	}
}
