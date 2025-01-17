package edu.alonso.tema3;

public class Operacion {


	public int Numero1;
	public int Numero2;
	
	public Operacion() {
		this.Numero1 = 0;
		this.Numero2 = 0;
	}
	
	public Operacion(int numero1 , int numero2) {
		this.Numero1 = numero1;
		this.Numero2 = numero2;
	}
	
	//Metodos
	
	public static int CalcularSuma(int numero1, int numero2) {
		int calcularSuma = (numero1 + numero2);
		return calcularSuma;
	}
	
	public static int CalcularResta(int numero1, int numero2) {
		int calcularResta = (numero1 - numero2);
		return calcularResta;
	}
	
	//Getters
	
	public int GetNumero1() {
		return Numero1;
	}
	
	public int GetNumero2() {
		return Numero2;
	}
	
	//Setters
	public void SetNumero1(int numero1) {
		this.Numero1 = numero1;
	}
	
	public void SetNumero2 (int numero2) {
		this.Numero2 = numero2;
	}
	
	//ToString
	
	@Override
	public String toString() {
		return "Numero1: " + Numero1 + "Numero2: " + Numero2; 
	}

}
