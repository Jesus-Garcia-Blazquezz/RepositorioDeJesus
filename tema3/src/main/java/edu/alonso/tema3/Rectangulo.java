package edu.alonso.tema3;

public class Rectangulo {

	public int ancho;
	public int largo;
	
	public final int LARGO_POR_DEFECTO = 10;
	public final int ANCHO_POR_DEFECTO = 5;
	
	
	public Rectangulo() {
		this.largo = LARGO_POR_DEFECTO;
		this.ancho = ANCHO_POR_DEFECTO;
	}
	
	public Rectangulo(int ancho, int largo) {
		if(ancho > 1 && largo > 1) {
			this.ancho = ancho;
			this.largo = largo;
		}
		
		else {
			this.ancho = ANCHO_POR_DEFECTO;
			this.largo = LARGO_POR_DEFECTO;
		}
	}
		//Getters
		public int GetAncho() {
			return ancho;
		}
		
		public int GetLargo() {
			return largo;
		}
		
		//Setters
		
		public void SetAncho(int ancho) {
			if (ancho > 1) {
				this.ancho = ancho;
		}
			else {
				this.ancho = ANCHO_POR_DEFECTO;
			}
	}

		public void SetLargo(int largo) {
			if (largo > 1) {
				this.largo = largo;
			}
			else {
				this.largo = LARGO_POR_DEFECTO;
			}
		}
			
			//Metodos
			public double CalcularArea() {
				double calcularArea = ancho*largo;
				return calcularArea;
			}
			
			public double CalcularPerimetro() {
				double calcularPerimetro = 2* (ancho+largo);
				return calcularPerimetro;
			}
			
			public boolean esHorizontal() {
				if(largo > ancho) {
					return true;
				}
				return false;
			}
			
			public boolean esVertical() {
				if(largo < ancho) {
					return true;
				}
				return false;
			}
			
			//ToString
			@Override
			public String toString() {
				return "Largo: " + largo + " / Ancho: " + ancho;
			}
			
			//Metodo dibujo rectangulo con asteriscos
			public void DibujoAsteriscosRectangulo(int largo, int ancho) {
				for (int i = 1; i<= ancho; i++) { //Para las filas
					for(int j = 1; j <= largo; j++) { //Para las columnas
						System.out.print("*");
					}
					
					System.out.println(" ");
				}
			}
}
