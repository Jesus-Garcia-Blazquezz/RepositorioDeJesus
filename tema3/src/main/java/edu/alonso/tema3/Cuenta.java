package edu.alonso.tema3;

public class Cuenta {

	public String titular;
	public double cantidad;
	
	//Primer constructor
	public Cuenta() {
		this.cantidad = 0.0;
		this.titular = "";
	}
	
	//Segundo constructor
	
	public Cuenta(String titular, double cantidad) {
		this.cantidad = cantidad;
		this.titular = titular;
	}
	
	
	//Metodos
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad = this.cantidad + cantidad;
		} else {
			
		}
	}
	
	public void retirar (double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}
		else {
			this.cantidad = this.cantidad - cantidad;
		}
	}
	
	//ToString
	@Override
	public String toString() {
		return "Titular:" + titular + "Cantidad: " + cantidad;
	}
	
	
}
