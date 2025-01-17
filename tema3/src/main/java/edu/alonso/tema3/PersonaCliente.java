package edu.alonso.tema3;
 
public class PersonaCliente {
 
	public String Nombre;
	public String Apellidos;
	public int DNI;
	public int edad;
	
	public PersonaCliente (String Nombre, int DNI) {
		this.Nombre = Nombre;
		this.DNI = DNI;
	}
	
	
	public PersonaCliente (String Nombre, int DNI, String Apellidos, int edad) {
		this.Nombre = Nombre;
		this.DNI = DNI;
		this.Apellidos = Apellidos;
		this.edad = edad;
	}
	
	
	//Gets
	public String GetNombre() {
		return Nombre;
	}
	
	public int GetDNI() {
		return DNI;
	}
	
	public String GetApellidos() {
		return Apellidos;
	}
	
	public int GetEdad() {
		return edad;
	}
	
	
	//Sets
	
	public void SetNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public void SetDNI(int DNI) {
		this.DNI = DNI;
	
	}
	
	public void SetApellidos (String Apellidos) {
		this.Apellidos = Apellidos;
	}
	
	public void SetEdad(int edad) {
		this.edad = edad;
		
	}
	
	//To String
	
	@Override
	
	public String toString() {
		return " Nombre: " + Nombre + " DNI: " + DNI + " Apellidos: " + Apellidos + " Edad: " + edad;
	}
	
}
 