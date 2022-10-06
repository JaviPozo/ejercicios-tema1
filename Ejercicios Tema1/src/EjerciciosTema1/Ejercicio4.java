package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Definimos las variables
		double altura;
		double base;
		double area;
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que intoduzca la altura
		System.out.print("Introduzca la base: ");
		base = sc.nextDouble();
		
		// Le pedimos al usuario que intoduzca la altura
		System.out.print("Introduzca la altura: ");
		altura = sc.nextDouble();
		
		area = (base*altura/2);
		
		// Creamos un system para que pueda imprimirlo
		System.out.print("El área del triangulo es: " + area);
		

	}

}
