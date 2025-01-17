package edu.alonso.tema4;

public class Cuentas {

	
	public String nombre;
	public String IBAN;
	public double dinero;
	
	
	public Cuentas (String nombre,String IBAN, double dinero) {
		 this.nombre = nombre;
		 this.IBAN = IBAN;
		 this.dinero = dinero;
		
	}

	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public double getDinero() {
		return dinero;
	}

	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}


	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	
	//ToString
	
	@Override
	public String toString() {
		return "Cuentas [nombre=" + nombre + ", IBAN=" + IBAN + ", dinero=" + dinero + "]";
	}
	
	
}
