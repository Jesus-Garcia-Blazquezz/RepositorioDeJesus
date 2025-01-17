package edu.alonso.tema3;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta1 = new Cuenta("Juan Carlos", 500.0);
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setTitular("Ana Gonzalez");
		cuenta2.setCantidad(200.0);
		
		//Estados de ambas cuentas
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		
		//Ingresar cantidades
		
		//Cuenta1
		System.out.print("Ingrese una cantidad para ingresar en la cuenta1: ");
		double cantidadIngresar1 = sc.nextDouble();
		cuenta1.ingresar(cantidadIngresar1);
		System.out.println("Estado de la cuenta1 después de la cantidad ingresada: ");
		System.out.println(cuenta1);
		
		
		//Cuenta2
		System.out.println("Introduce la cantidad a ingresar en la cuenta2");
		double CantidadIngresar2 = sc.nextDouble();
		cuenta2.ingresar(CantidadIngresar2);
		System.out.println("Estado de la cuenta2 después de ingresar la cantidad: ");
		System.out.println(cuenta2);
		
		//Retirar cantidades
		//Cuenta1
		System.out.println("Introduce la cantidad a retirar de la cuenta1: ");
		double cantidadRetirar1 = sc.nextDouble();
		cuenta1.retirar(cantidadRetirar1);
		System.out.println("Estado de la cuenta1 después de retirar la cantidad: ");
		System.out.println(cuenta1);
		
		//Cuenta2
		System.out.println("Introduce la cantidad a retirar de la cuenta2: ");
		double cantidadRetirar2 = sc.nextDouble();
		cuenta2.retirar(cantidadRetirar2);
		System.out.println("Estado de la cuenta2 después de retirar la cantidad: ");
		System.out.println(cuenta2);
		
		//Mostrar el estado final de las dos cuentas
	System.out.println("Resultado final de ambas cuentas: ");
	System.out.println(cuenta1);
	System.out.println(cuenta2);
		
	}
}
