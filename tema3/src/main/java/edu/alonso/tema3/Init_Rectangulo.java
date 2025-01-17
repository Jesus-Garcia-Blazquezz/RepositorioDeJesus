package edu.alonso.tema3;

import java.util.Scanner;

public class Init_Rectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor del ancho: ");
		int ancho = sc.nextInt();
		System.out.println("Introduce el valor del largo: ");
		int largo = sc.nextInt();
		
		Rectangulo rectangulo = new Rectangulo(ancho, largo);
		
		System.out.println(rectangulo);
		
		System.out.println("El Área del rectangulo es: ");
		double áreaRectangulo = rectangulo.CalcularArea();
		System.out.println(áreaRectangulo);
		
		System.out.println("El perimetro del rectangulo es: ");
		double perimetroRectangulo = rectangulo.CalcularPerimetro();
		System.out.println(perimetroRectangulo);
	
	
		System.out.println("El rectangulo es horizontal?: ");
		boolean rectanguloHorizontal = rectangulo.esHorizontal();
		System.out.println(rectanguloHorizontal);
		
		System.out.println("El rectangulo es vertical?: ");
		boolean rectanguloVertical = rectangulo.esVertical();
		System.out.println(rectanguloVertical);
		
		
		System.out.println("Rectangulo mediante asteriscos: ");
		rectangulo.DibujoAsteriscosRectangulo(ancho, largo);
	}
	
}
