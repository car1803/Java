package poo;
public class Coche {
	//define caracteristicas comunes
	int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso_plataforma;
	//define otras caracteristicas
	String color;
	int peso_total;
	boolean asientos_cuero,climatizador;
	
	//metodo constructor (metodo que da un estado inical al objeto)
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	//metodo setter
	public void establece_color() {
		color="azul";
	}
	//metodo getter
	public String ver_largo() {
		return "el largo es "+largo;
	}
	public String ver_color() {
		return "el color es "+color;
	}
}
