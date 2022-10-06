package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos las variables
		int horas, minutos, segundos, seg, modulo;

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una cantidad de segundos: ");
		seg = sc.nextInt();

		horas = seg / 3600;
		modulo = seg % 3600;
		minutos = modulo / 60;
		segundos = modulo % 60;

		System.out.println("Hay " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos ");

	}

}
