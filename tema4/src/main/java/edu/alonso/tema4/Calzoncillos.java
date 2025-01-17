package edu.alonso.tema4;


public class Calzoncillos {
        
    	public String marca;
    	public int talla;
    	
    public Calzoncillos(String marca, int talla) {
    	this.marca = marca;
    	this.talla = talla;
    }
    
    
    //Gets
    public String getMarca() {
    	return marca;
    }
    
    
	public int getTalla() {
    	return talla;
    }
    
    //Sets
    
    public void setMarca(String marca) {
    	this.marca = marca;
    	
    }
    
    public void setTalla(int talla) {
    	this.talla = talla;
    }
    
    //ToString
    
	@Override
	public String toString() {
		return "Calzoncillos [marca=" + marca + ", talla=" + talla + "]";
	}

}
