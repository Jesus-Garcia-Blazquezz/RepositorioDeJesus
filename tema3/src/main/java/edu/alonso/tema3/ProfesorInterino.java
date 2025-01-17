package edu.alonso.tema3;

import java.time.LocalDateTime;

public class ProfesorInterino extends Profesor {

	public LocalDateTime fechaInicioInterinidad;
	
	public ProfesorInterino(String nombre, String modulo1, String modulo2, String modulo3, String modulo4, LocalDateTime fechaInicioInterinidad) {
		super(nombre,modulo1,modulo2,modulo3,modulo4);
		this.fechaInicioInterinidad = LocalDateTime.now();
	}
	
	//Getters
	public LocalDateTime GetfechaInicioInterinidad() {
		return fechaInicioInterinidad;
	}
	
	//Setters
	public void SetFechaInicioInterinidad (LocalDateTime fechaInicioInterinidad) {
		this.fechaInicioInterinidad = fechaInicioInterinidad;
	}
	
	//ToString
	@Override
	public String toString() {
		return super.toString() + " FechaInicioInterinidad: " + fechaInicioInterinidad;
	}
	
}
