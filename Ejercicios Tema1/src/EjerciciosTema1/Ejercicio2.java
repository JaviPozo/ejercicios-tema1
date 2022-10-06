package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables
		int numeroEntero, resto, sumatorio;
		final int siete = 7;

		// Creamos un scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que escriba un número
		System.out.print("Introduzca un número entero: ");
		numeroEntero = sc.nextInt();

		resto = numeroEntero % siete;
		
		sumatorio = siete - resto;
		
		sumatorio = resto==0 ? 0 : sumatorio;
		
		System.out.printf("Hay que sumarle: %d" , sumatorio);
		

	}

}
