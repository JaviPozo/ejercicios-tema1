package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Definimos las variables
		double longitud;

		// Cramos Scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Longitud en metros: ");
		longitud = sc.nextDouble();

		longitud *= 100;

		System.out.println("La distancia es: " + (int) longitud);

	}

}
