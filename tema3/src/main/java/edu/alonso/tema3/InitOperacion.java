package edu.alonso.tema3;

import java.util.Scanner;

public class InitOperacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int numero2 = sc.nextInt();
		
		//Declarar objetos
		Operacion suma = new Operacion(numero1,  numero2);
		Operacion resta = new Operacion(numero1, numero2);
		
		
		//Suma de los numeros enteros
		System.out.println("Suma de los numeros enteros: ");
		double calcularSuma = suma.CalcularSuma(numero1, numero2);
		System.out.println(calcularSuma);
		
		
		//Resta de los numeros enteros
		System.out.println("Resta de los numeros enteros: ");
		double calcularResta = resta.CalcularResta(numero1, numero2);
		System.out.println(calcularResta);
	}
}
