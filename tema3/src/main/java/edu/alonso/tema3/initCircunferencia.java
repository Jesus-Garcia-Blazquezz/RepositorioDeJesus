package edu.alonso.tema3;

import java.util.Scanner;

public class initCircunferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una opcion: 1- Calcular la longitud, 2- Calcular el radio");
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			System.out.println("Introduce el valor del radio: ");
			double radio = sc.nextDouble();
			Circunferencia circunferencia = new Circunferencia(radio);
			//Calcular longitud
			double longitud = circunferencia.CalcularLongitud(radio);
			System.out.println("La longitud de la circunferencia es: " + longitud);
			
		}
		
		else if (opcion == 2) {
			System.out.println("Introduce el valor de la longitud: ");
			double longitud = sc.nextDouble();
			
			//Calcular Radio
			Circunferencia circunferencia = new Circunferencia(longitud);
			double radio = circunferencia.CalcularRadio(longitud);
			System.out.println("El radio de la circunferencia es: " + radio);
		}
		
		else {
			System.out.println("Opcion introducida invalida, porfavor introduce una opcion(1 o 2)");
		}
	}
}
