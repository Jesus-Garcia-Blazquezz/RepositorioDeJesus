package edu.alonso.tema3;
 
public class Bizum {
	public long TelefonoOrigen;
	public long TelefonoDestino;
	
	public Bizum (long telefonoOrigen, long telefonoDestino) {
		this.TelefonoOrigen = telefonoOrigen;
		this.TelefonoDestino = telefonoDestino;
}	
	
	//Gets
	public long GetTelefonoOrigen() {
		return TelefonoOrigen;
	}
	
	public long GetTelefonoDestino() {
		return TelefonoDestino;
	}
	
	//Sets
	public void SetTelefonoOrigen (long TelefonoOrigen) {
		this.TelefonoOrigen = TelefonoOrigen;
	}
	
	public void SetTelefonoDestino (long TelefonoDestino) {
		this.TelefonoDestino = TelefonoDestino;
		
	}
	
	
	//ToString
	
	@Override
	public String toString() {
		return " TelefonoOrigen : " + TelefonoOrigen + " TelefonoDestino: " + TelefonoDestino;
	}
}

