package edu.alonso.tema3;

import java.time.LocalDateTime;

public class ProfesorTitular extends Profesor {
	
		public LocalDateTime fechaAprobadoOposicion;
		
		public ProfesorTitular(String nombre, String modulo1, String modulo2, String modulo3, String modulo4, LocalDateTime fechaAprobadoOposicion) {
			super(nombre,modulo1,modulo2,modulo3,modulo4);
			this.fechaAprobadoOposicion = fechaAprobadoOposicion;
		}
		
		//Getters
		public LocalDateTime GetfechaAprobadoOposicion() {
			return fechaAprobadoOposicion;
		}
		
		//Setters
		public void SetFechaAprobadoOposicion (LocalDateTime fechaAprobadoOposicion) {
			this.fechaAprobadoOposicion = fechaAprobadoOposicion;
		}
		
		//ToString
		@Override
		public String toString() {
			return super.toString() + " FechaAprobadoOposicion: " + fechaAprobadoOposicion;
		}
		
	}
