package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos las varibles
		double sumaMilimetros;
		double sumaCentimetros;
		double sumaMetros;
		double resultado;
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca la distancia en milimetros
		System.out.print("Introduza la distancia en milímetros: ");
		sumaMilimetros = sc.nextDouble();
		
		// Le pedimos al usuario que introduzca la distancia en centimetros
		System.out.print("Intoduzca la distancia en centimetros: ");
		sumaCentimetros = sc.nextDouble();
		
		// Le pedimos al usuario que introduzca la distancia en metros
		System.out.print("Introduzca la distancia en metros: ");
		sumaMetros = sc.nextDouble();
		
		resultado = (sumaMetros*100) + (sumaCentimetros) + (sumaMilimetros/10);
		 System.out.println("TOTAL SUMA en cms: " + resultado);
		
	}

}
