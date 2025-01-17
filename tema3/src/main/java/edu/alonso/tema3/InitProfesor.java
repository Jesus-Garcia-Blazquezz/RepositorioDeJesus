package edu.alonso.tema3;

import java.util.Scanner;
import java.time.LocalDateTime;

public class InitProfesor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el nombre del profesor1: ");
		String nombre = sc.next();
		System.out.println("Introduce el nombre de los cuatro modulos que imparte el profesor1: ");
		String modulo1 = sc.next();
		String modulo2 = sc.next();
		String modulo3 = sc.next();
		String modulo4 = sc.next();
		
		Profesor profesor1 = new Profesor(nombre,modulo1, modulo2,modulo3,modulo4);
		System.out.println(profesor1);
		
		
		System.out.println("Introduce el nombre del profesor2 que es Titular: ");
		String nombre2 = sc.next();
		System.out.println("Introduce el nombre de los 4 modulos que imparte el profesor2: ");
		String modulo24 = sc.next();
		String modulo25 = sc.next();
		String modulo26 = sc.next();
		String modulo27 = sc.next();
		LocalDateTime fechaOposicion = LocalDateTime.now().withYear(2023).withDayOfYear(8).withMonth(12);
		ProfesorTitular profesor2 = new ProfesorTitular(nombre2,modulo24,modulo25,modulo26,modulo27, fechaOposicion);
		System.out.println(profesor2);
		
		System.out.println("Introduce el nombre del profesor3 que es Interino: ");
		String nombre3 = sc.next();
		System.out.println("Introduce el nombre de los 4 modulos que imparte el profesor3: ");
		String modulo10 = sc.next();
		String modulo11 = sc.next();
		String modulo12 = sc.next();
		String modulo13 = sc.next();
		LocalDateTime fechaInicioInterinidad = LocalDateTime.now().withYear(2022).withDayOfYear(10).withMonth(5);
		ProfesorInterino profesor3 = new ProfesorInterino(nombre3,modulo10,modulo11,modulo12,modulo13, fechaInicioInterinidad);
		System.out.println(profesor3);
	}
}
