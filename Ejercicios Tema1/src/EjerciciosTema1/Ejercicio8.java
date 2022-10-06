package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Definimos las variables
		final double infantiles = 15.50;
		final double adultos = 20;
		int entradaNiños, entradaAdultos;
		double total,porcentaje = 0.05;
		
		
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¿Cuantos niños entran? ");
		entradaNiños = sc.nextInt();
		
		System.out.print("¿Cuantos adultos entran? ");
		entradaAdultos = sc.nextInt();
		
		total = entradaNiños*infantiles + entradaAdultos*adultos;
		
		total = total>=100 ? total-= total*0.05 : total;
		
		

	}

}
