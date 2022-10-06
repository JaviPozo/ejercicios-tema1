package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos las variables
		int num1, num2, resto, sumatorio;
		

		// Creamos un scanner para que lea el teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que escriba un número
		System.out.print("Introduzca un número entero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca un número entero: ");
		num2 = sc.nextInt();

		resto = num1 % num2;

		sumatorio = num2 - resto;

		sumatorio = resto == 0 ? 0 : sumatorio;

		System.out.printf("Hay que sumarle: %d", sumatorio);

	}

}
