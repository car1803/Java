package condicionales;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite el dia");
		int dia = entrada.nextInt();
		System.out.println("digite el mes");
		int mes = entrada.nextInt();
		System.out.println("digite el año");
		int año = entrada.nextInt();
		if ((año>0)&&(dia>0)&&(mes>0)) {
			if (mes == 2){
				if (dia <= 28) {
					System.out.println("La fecha es correcta");
				} else {
					System.out.println("La fecha es incorrecta");
				}
			}
			else if ((mes == 4) || (mes ==6)||(mes==9)||(mes==11)) {
				if  (dia <= 30){
					System.out.println("La fecha es correcta");
				} else {
					System.out.println("La fecha es incorrecta");
				}
			}
			else if ((mes == 1)||(mes ==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
				if (dia <= 31) {
					System.out.println("La fecha es correcta");
				} else {
					System.out.println("La fecha es incorrecta");
				}
			} else {
				System.out.println("La fecha es incorrecta");
			}
		}
		else {
			System.out.println("fecha incorrecta");
		}

	}
}
