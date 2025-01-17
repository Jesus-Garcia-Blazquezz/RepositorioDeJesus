package edu.alonso.tema3;

public class Domicilio {

	public String calle;
	public int numcalle;
	public int puerta;
	public int numPortal;

	public Domicilio(String calle, int puerta) {
		this.calle = calle;
		this.puerta = puerta;
	}

	public Domicilio(String calle, int puerta, int numcalle, int numPortal) {
		this.calle = calle;
		this.puerta = puerta;
		this.numcalle = numcalle;
		this.numPortal = numPortal;
	}

//Gets
	public String GetCalle() {
		return calle;
	}

	public int Getpuerta() {
		return puerta;
	}

	public int Getnumcalle() {
		return numcalle;
	}

	public int GetnumeroPortal() {
		return numPortal;
	}

//Sets

	public void SetCalle(String Calle) {
		this.calle = Calle;
	}

	public void Setpuerta(int puerta) {
		this.puerta = puerta;

	}

	public void SetNumCalle(int numcalle) {
		this.numcalle = numcalle;
	}

	public void SetnumPortal(int numPortal) {
		this.numPortal = numPortal;

	}

	
	//To String
	
	@Override
	public String toString() {
		return " Calle: " + calle + " Puerta: " + puerta + " Numcalle: " + numcalle + " NumPortal " + numPortal;
	}

}
