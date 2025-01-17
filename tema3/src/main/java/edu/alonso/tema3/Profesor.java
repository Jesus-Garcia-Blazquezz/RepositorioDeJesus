package edu.alonso.tema3;

public class Profesor extends Persona {
	
public String modulo1;
public String modulo2;
public String modulo3;
public String modulo4;


public Profesor (String nombre, String modulo1, String modulo2, String modulo3, String modulo4) {
	super(nombre);
	this.modulo1 = modulo1;
	this.modulo2 = modulo2;
	this.modulo3 = modulo3;
	this.modulo4 = modulo4;
}


//Getters
public String GetModulo1() {
	return modulo1;
}

public String GetModulo2() {
	return modulo2;
}


public String GetModulo3() {
	return modulo3;
}


public String GetModulo4() {
	return modulo4;
}

//Setters
public void SetModulo1(String modulo1) {
	this.modulo1 = modulo1;
}

public void SetModulo2 (String modulo2) {
	this.modulo2 = modulo2;
}

public void SetModulo3 (String modulo3) {
	this.modulo3 = modulo3;
}

public void SetModulo4 (String modulo4) {
	this.modulo4 = modulo4;
}

//ToString
@Override
public String toString() {
	return super.toString() + "Modulo1: " + modulo1 + " Modulo2: " + modulo2 + " Modulo3: " + modulo3 + " Modulo4: " + modulo4;
}

}
