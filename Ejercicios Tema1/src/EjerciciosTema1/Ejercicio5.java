package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Definimos las variables
		double a;
		double b;
		double c;
		double x;
		double y;
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que le de un valor a "a"
		System.out.print("Intruzca un valor para a: ");
		a = sc.nextDouble();
		
		// Le pedimos al usuario que le de un valor a "b"
		System.out.print("Introduzca un valor para b: ");
		b = sc.nextDouble();
		
		// Le pedimos al usuario que le de un valor a "c"
		System.out.print("Introduzca un valor para c: ");
		c = sc.nextDouble();
		
		// Le pedimos al usuario que le de un valor a "x"
		System.out.print("Introduzca un valor para x: ");
		x = sc.nextDouble();
		
		y = (a*x*x) + (b*x) + c ;
		
		// Ahora imprimimos el resultado
		System.out.print("El valor de y es: " + y);
	}

}
