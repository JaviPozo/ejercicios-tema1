package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos las variables para alamacenar los datos
		double numeroDecimales;

		// Creamos el Scanner para que puedad leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número con decimales
		System.out.print("Introduzca un numero con decimales: ");
		numeroDecimales = sc.nextDouble();

		numeroDecimales += 0.5;

		System.out.println("El número redondeado es: " + (int) numeroDecimales);

	}

}
