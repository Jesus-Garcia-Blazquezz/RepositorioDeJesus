<<<<<<< HEAD
package edu.alonso.tema4;

public class Init2Calzoncillos {

	public static void main(String[] args) {
		
		Calzoncillos[][] kullen = new Calzoncillos[3][5];
		
		kullen[0][0] = new Calzoncillos("Channo", 42);
		kullen[0][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[0][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[0][3] = new Calzoncillos("Addioss", 39);
		kullen[0][4] = new Calzoncillos("Suprimoh", 44);
		kullen[1][0] = new Calzoncillos("Channo", 42);
		kullen[1][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[1][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[1][3] = new Calzoncillos("Addioss", 39);
		kullen[1][4] = new Calzoncillos("Suprimoh", 44);
		kullen[2][0] = new Calzoncillos("Channo", 42);
		kullen[2][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[2][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[2][3] = new Calzoncillos("Addioss", 39);
		kullen[2][4] = new Calzoncillos("Suprimoh", 44);
		
		
		for (int i = 0; i < kullen.length; i++) {
			for (int j = 0; j < kullen[i].length; j++) {
				System.out.println(kullen[i][j]);
			}
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < kullen[1].length; i++) {
			System.out.println(kullen[1][i]);
		}
		
		}
	}
=======
package edu.alonso.tema4;

public class Init2Calzoncillos {

	public static void main(String[] args) {
		
		Calzoncillos[][] kullen = new Calzoncillos[3][5];
		
		kullen[0][0] = new Calzoncillos("Channo", 42);
		kullen[0][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[0][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[0][3] = new Calzoncillos("Addioss", 39);
		kullen[0][4] = new Calzoncillos("Suprimoh", 44);
		kullen[1][0] = new Calzoncillos("Channo", 42);
		kullen[1][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[1][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[1][3] = new Calzoncillos("Addioss", 39);
		kullen[1][4] = new Calzoncillos("Suprimoh", 44);
		kullen[2][0] = new Calzoncillos("Channo", 42);
		kullen[2][1] = new Calzoncillos("Klavin klein" , 40);
		kullen[2][2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[2][3] = new Calzoncillos("Addioss", 39);
		kullen[2][4] = new Calzoncillos("Suprimoh", 44);
		
		
		for (int i = 0; i < kullen.length; i++) {
			for (int j = 0; j < kullen[i].length; j++) {
				System.out.println(kullen[i][j]);
			}
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < kullen[1].length; i++) {
			System.out.println(kullen[1][i]);
		}
		
		}
	}
>>>>>>> 4f41d84 (Descripcion del commit)
