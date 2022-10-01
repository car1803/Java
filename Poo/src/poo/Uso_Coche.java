package poo;

public class Uso_Coche {
	public static void main(String[] args) {
		Coche Renault = new Coche(); //instanciar una clase, llama al metodo constructor
		Renault.establece_color();
		System.out.println(Renault.ver_largo()+"\n"+Renault.ver_color());
	}
}
