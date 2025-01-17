package edu.alonso.tema3;

import java.util.Random;

public class OperaciónBancaria {

	public PersonaCliente cliente;
	public String IBAN;
	public Domicilio domicilio;

	public OperaciónBancaria (PersonaCliente cliente, String IBAN, Domicilio domicilio) {
		this.cliente = cliente;
		this.IBAN = generarIBAN();
		this.domicilio = domicilio;
	}
	
	public OperaciónBancaria (PersonaCliente cliente, Domicilio domicilio) {
		this.cliente = cliente;
		this.domicilio = domicilio;
	}
	
	public String generarIBAN() {
		Random random = new Random();
		
		//Definición de prefijos posibles
		String[] prefijos = {"ES91", "ES32" , "ES45"};
		
		//Selección de un prefijo aleatorio
		
		String prefijo = prefijos[random.nextInt(prefijos.length)];
		
		//Generación de bloques de números aleatorios
		StringBuilder iban = new StringBuilder(prefijo);
		
		for(int i = 0; i < 5; i++) {
			int TamañoBloqueDigitos = (i == 4) ? 5 : 4; //Si i es igual a 4 entonces debe de tener 5 digitos, pero si i no es igual a 4 pues que sean 4 digitos
			
			//Generación de numeroAleatorio
			int numeroAleatorio = random.nextInt((int) Math.pow(10, TamañoBloqueDigitos));
			
			//Formateamos el numeroAleatorio
			String BloqueFormateado = (String.format("%0" + TamañoBloqueDigitos + "d", numeroAleatorio));
			
			//Añadimos el numeroAleatorio formateado al IBAN
			
			iban.append(BloqueFormateado);
			
			//Dejamos espacios por cada bloque de digitos
			if (i < 4) {
				iban.append(" ");
			}
		}

		return iban.toString();
	}
	
	
	//Gets
	public PersonaCliente Getcliente() {
		return cliente;
	}
	
	public String GetIBAN() {
		return IBAN;
	}
	
	public Domicilio Getdomicilio() {
	return domicilio;
	
	}
	
	//Sets
	
	public void SetCliente (PersonaCliente cliente) {
		this.cliente = cliente;
	}
	
	public void SetIBAN (String IBAN) {
		this.IBAN = IBAN;
	}
	
	public void SetDomicilio (Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	//To String
	
	@Override
	
	public String toString() {
		return " Cliente: " + cliente + " IBAN origen: " + IBAN + " Domicilio: " + domicilio;
	}
	

	}
