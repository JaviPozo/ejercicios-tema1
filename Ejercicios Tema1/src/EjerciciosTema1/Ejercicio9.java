package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creamos las variables
		int primerNumero;
		int segundoNumero;
		boolean resultado;
		
		// Creamos un Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduzca el primer número: ");
		primerNumero = sc.nextInt();
		
		// Le pedimos al usuario que introduzca el segundo número
		System.out.print("Introduzca el sugundo número: ");
		segundoNumero = sc.nextInt();
		
		resultado =primerNumero==segundoNumero?true:false;
		
		System.out.println("Son iguales?:  "+resultado); 

	}

}
