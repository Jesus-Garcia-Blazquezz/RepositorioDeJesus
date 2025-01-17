package edu.alonso.tema3;

import java.util.Scanner;
public class InitPersona {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la persona1: ");
		String nombre = sc.next();
		System.out.println("Introduce la edad de la persona1: ");
		int edad = sc.nextInt();
		System.out.println("Introduce el sexo de la persona1: ");
		char sexo = sc.next().toUpperCase().charAt(0);
		System.out.println("Introduce el peso de la persona1: ");
		double peso = sc.nextDouble();
		System.out.println("Introduce la altura de la persona1: ");
		double altura = sc.nextDouble();
		
		Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
		
		System.out.println("Introduce el nombre de la persona2: ");
		String nombre2 = sc.next();
		System.out.println("Introduce la edad de la persona2: ");
		int edad2 = sc.nextInt();
		System.out.println("Introduce el sexo de la persona2: ");
		char sexo2 = sc.next().toUpperCase().charAt(0);
		System.out.println("Introduce el peso de la persona2: ");
		double peso2 = sc.nextDouble();
		System.out.println("Introduce la altura de la persona2: ");
		double altura2 = sc.nextDouble();
		
		
		Persona persona2 = new Persona(nombre2,edad2,sexo2,peso2,altura2);
		
		System.out.println("Introduce el nombre de la persona3: ");
		String nombre3 = sc.next();
		System.out.println("Introduce la edad de la persona3: ");
		int edad3 = sc.nextInt();
		System.out.println("Introduce el sexo de la persona3: ");
		char sexo3 = sc.next().toUpperCase().charAt(0);
		System.out.println("Introduce el peso de la persona3: ");
		double peso3 = sc.nextDouble();
		System.out.println("Introduce la altura de la persona3: ");
		double altura3 = sc.nextDouble();
		
		
		Persona persona3 = new Persona(nombre3,edad3,sexo3,peso3,altura3);
		
		System.out.println("Introduce el nombre de la persona4: ");
		String nombre4 = sc.next();
		
		
		Persona persona4 = new Persona(nombre4);
			
		
		//Mostrar la informacion de las personas
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println(persona4);
		
		
		//IMC de cada persona
		
		System.out.println("El ICM de cada persona es: ");
		System.out.println("Persona1: ");
		System.out.println(persona1.calcularIMC(peso, altura));
		System.out.println("Persona2: ");
		System.out.println(persona2.calcularIMC(peso, altura));
		System.out.println("Persona3: ");
		System.out.println(persona3.calcularIMC(peso, altura));
		System.out.println("Persona4: ");
		System.out.println(persona4.calcularIMC(peso, altura));
		
		//La persona es mayor?
		System.out.println("La persona es mayor?: ");
		System.out.println("Persona1: ");
		System.out.println(persona1.esMayorDeEdad());
		System.out.println("Persona2: ");
		System.out.println(persona2.esMayorDeEdad());
		System.out.println("Persona3: ");
		System.out.println(persona3.esMayorDeEdad());
		System.out.println("Persona4: ");
		System.out.println(persona4.esMayorDeEdad());
		
	}
}
