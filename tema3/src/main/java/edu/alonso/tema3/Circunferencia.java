package edu.alonso.tema3;

public class Circunferencia {

	public double radio; // longitud/ (2*PI)
	public double longitud; //2*PI*radio
	
	public Circunferencia () {
		 this.longitud = 0.00;
		 this.radio = 0.00;
		}
	
	public Circunferencia(double radio) {
		this.radio = radio;
	}
	
	//Metodos
	
	public double CalcularRadio(double longitud) {
		//radio
		double calcularRadio = longitud / (2*Math.PI);
		return calcularRadio;
	}
	
	public double CalcularLongitud(double radio) {
		//longitud 
		double calcularLongitud = 2*Math.PI*radio;
		return calcularLongitud;
	}
	
	//Gets
	public double GetRadio() {
		return radio;
	}
	
	public double GetLongitud() {
		return longitud;
	}
	
	//Sets
	public void SetRadio(double radio) {
		this.radio = radio;
	}
	
	public void SetLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	//ToString
	
	@Override
	
	public String toString() {
		return "Radio: " + radio + "Longitud: " + longitud;
	}
	
}
