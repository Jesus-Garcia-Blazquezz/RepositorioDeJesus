package edu.alonso.tema3;

    	
    	public class EmbutidoManolo {
    		public String Nombre;
    		public int Edad;
    		public String Apellidos;
    		public String Profesión;
    		
    		public EmbutidoManolo(String Nombre, int Edad, String Apellidos) {
    			this.Nombre = Nombre;
    			this.Edad = Edad;
    			this.Apellidos = Apellidos;
    			
    		}
    		
    		public EmbutidoManolo(String Nombre, int Edad, String Apellidos, String Profesión) {
    			this.Nombre = Nombre;
    			this.Edad = Edad;
    			this.Apellidos = Apellidos;
    			this.Profesión = Profesión;
    		}
    		
    		//Gets
    		
    		public String GetNombre( ) {
    			return Nombre;
    		}
    		
    		public int GetEdad() {
    			return Edad;
    		}
    		
    		public String GetApellidos() {
    			return Apellidos;
    		}
    		
    		public String GetProfesión() {
    			return Profesión;
    		}
    		
    		//Sets
    		
    		public void SetNombre(String Nombre) {
    			this.Nombre = Nombre;
    		}
    		
    		public void SetEdad (int Edad) {
    			this.Edad = Edad;
    		}
    		
    		
    		public void SetApellidos(String Apellidos) {
    			this.Apellidos = Apellidos;
    		}
    		
    		public void SetProfesión (String Profesión) {
    			this.Profesión = Profesión;
    		}
    		
    		// toString
    		
    		@Override
    		
    		public String toString() {
    			return "Nombre: " + Nombre + " / Edad: " + Edad + " / Apellidos: " + Apellidos + " / Profesión: " + Profesión;
    		}
    		
    }
