package edu.alonso.tema3;

public class InitEmbutidoManolo {

	
	public static void main(String[] args) {
		
		EmbutidoManolo Manolo = new EmbutidoManolo("Manolo", 35, "Martínez Fernández");
		
		System.out.println("El contenido del objeto Manolo es: " + Manolo);
		
		
		EmbutidoManolo Pepe = new EmbutidoManolo("Pepe", 27, "García López", "Ayudante1");
		System.out.println("El contenido del objeto Pepe es: " + Pepe);
		
		EmbutidoManolo Juan = new EmbutidoManolo("Juan", 30, "González Sánchez","Ayudante2");
		
		System.out.println("El contenido del objeto Juan es: " + Juan);
		
		Manolo.SetProfesión("Jefe de la carniceria");
		
		System.out.println("El contenido del objeto Manolo (nuevamente) es: " + Manolo);
	}
}
