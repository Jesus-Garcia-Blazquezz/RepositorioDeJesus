package edu.alonso.tema3;

import java.util.Random;

public class Persona {

	public String nombre;
	public int edad;
	public int DNI;
	public char letra;
	public char sexo;
	public double peso;
	public double altura;
	
	public final double PESO_BAJO = -1;
	public final double PESO_NORMAL = 0;
	public final double SOBREPESO = 1;
	public final double ALGO_SALIO_MAL = -5;
	
	
	public Persona (String nombre) {
		this.nombre = nombre;
		generaDNI();
	}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		generaDNI();
	}
	
	public Persona (String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generaDNI();
	}
	
	//Metodos
	
	public double calcularIMC(double peso, double altura) {
		double IMC = peso/(Math.pow(altura, 2));
		if (IMC < 20) {
			System.out.println("Esta en un peso bajo");
			return PESO_BAJO;
		}
		else if (IMC >= 20 && IMC <= 25) {
			System.out.println("Esta en un peso normal");
			return PESO_NORMAL;
		}
		else if (IMC > 25) {
			System.out.println("Tiene sobrepeso");
			return SOBREPESO;
		}
		else {
			System.out.println("Algo ha salido mal");
			return ALGO_SALIO_MAL;
		}
	}
		public boolean esMayorDeEdad() {
			if(edad >= 18) {
				return true;
			}
			return false;
			
		}
		
		public char comprobarSexo(char sexo) {
			if(sexo != 'H' && sexo !='M') {
				return 'H';
			} else {
				return sexo;
			}
		}
		
		//Metodo GenerarDNI
		public void generaDNI() {
			Random random = new Random();
			int num = random.nextInt(89999999 + 10000000);
			letra = GenerarLetra(num);
			this.DNI = num + letra;
		}
			//Crear Letra
			public char GenerarLetra(int num) {
				
			int numeroLetra = num %23;
			
			//Definicion de letra
			char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
			
			//Selección de letra
			
			return letras[numeroLetra];
			
			}
		//Getters
			public String GetNombre() {
				return nombre;
			}
			
			public int GetEdad() {
				return edad;
			}
			
			public int GetDNI() {
				return DNI;
			}
			
			public char GetSexo() {
				return sexo;
			}
			
			public double GetPeso() {
				return peso;
			}
			
			public double GetAltura() {
				return altura;
			}
			
			
		//Setters
			
			public void SetNombre(String nombre) {
				this.nombre = nombre;
			}
			
			public void SetEdad (int edad) {
				this.edad = edad;
			}
			
			
			public void SetDNI(int DNI) {
				this.DNI = DNI;
			}
			
			
			public void SetSexo (char sexo) {
				this.sexo = sexo;
			}
			
			public void SetPeso (double peso) {
				this.peso = peso;
			}
			
			public void SetAltura (double altura) {
				this.altura = altura;
			}
			
			
			
			//ToString
			@Override
			public String toString() {
				return "Nombre: " + nombre + " / Edad: " + edad + " / DNI: " + DNI + letra + " Sexo: " + comprobarSexo(sexo) + " / Peso: " + peso + " / Altura: " + altura;
			}
		}
