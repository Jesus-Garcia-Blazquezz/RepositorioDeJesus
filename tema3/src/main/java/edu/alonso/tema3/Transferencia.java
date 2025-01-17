package edu.alonso.tema3;

import java.util.Random;

public class Transferencia {
 
    public String IBANDestino;

    //Constructor para generar IBANAleatorio
    
    public Transferencia () {
    	this.IBANDestino = GenerarIBANDestino();
    }
    
    //Metodo para generar IBANAleatorio
    
    public String GenerarIBANDestino() {
    	Random random = new Random();
    
    
    //Definición de prefijos
    
    String[] prefijos = {"ES91", "ES32", "ES45"};
    
    //Seleccion de prefijo
    
    String prefijo = prefijos [random.nextInt(prefijos.length)];
    
    //Creación de bloques aleatorios
    
    StringBuilder IbanDestino = new StringBuilder(prefijo);
    
    for(int i = 0; i < 5; i++) {
    	int TamañoBloques = (i == 4) ? 5 : 4;
    	
    	//Generamos el numero aleatorio
    	
    	int numeroAleatorio = random.nextInt((int) Math.pow(10, TamañoBloques));
    			
    	//Formateamos el numero aleatorio
    			
    		String BloqueFormateado = String.format("%0" + TamañoBloques + "d" , numeroAleatorio);
    	
    	
    	//Añadimos el numero formateado al IBAN
    	
    	IbanDestino.append(BloqueFormateado);
    	
    	//Dejar espacios entre bloques, excepto al final
    	
    	if (i < 4) {
    		IbanDestino.append(" ");
    	}
    }
    return IbanDestino.toString();
    
    }

    // Getter para obtener el IBAN de destino
    public String GetIBANDestino() {
        return IBANDestino;
    }

    // Setter para modificar el IBAN de destino
    public void SetIBANDestino(String IBANDestino) {
        this.IBANDestino = IBANDestino;
    }

    // Método toString para imprimir el IBAN de destino
    @Override
    public String toString() {
        return "IBAN Destino: " + this.IBANDestino;
    }
}
