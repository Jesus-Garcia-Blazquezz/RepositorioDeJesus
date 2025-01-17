<<<<<<< HEAD
package edu.alonso.tema4;

public class InitCalzoncillos {

	public static void main(String[] args) {
		
		Calzoncillos kullen[] = new Calzoncillos[5];
		
		kullen[0] = new Calzoncillos("Channo", 42);
		kullen[1] = new Calzoncillos("Klavin klein" , 40);
		kullen[2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[3] = new Calzoncillos("Addioss", 39);
		kullen[4] = new Calzoncillos("Suprimoh", 44);
		
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		
		kullen[2].setMarca("Suhermanoh");
		
		System.out.println();
		
		System.out.println("Segunda parte");
		
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		
		//kullen[3] = null;
		
		System.out.println();
		
		System.out.println("Tercera parte: ");
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		System.out.println();
		
		System.out.println("Cuarta parte: ");
		
		for (Calzoncillos item : kullen) {
			item.setTalla(36);
			System.out.println(item);
		}
	}
}
=======
package edu.alonso.tema4;

public class InitCalzoncillos {

	public static void main(String[] args) {
		
		Calzoncillos kullen[] = new Calzoncillos[5];
		
		kullen[0] = new Calzoncillos("Channo", 42);
		kullen[1] = new Calzoncillos("Klavin klein" , 40);
		kullen[2] = new Calzoncillos("Jalvin Clain", 43);
		kullen[3] = new Calzoncillos("Addioss", 39);
		kullen[4] = new Calzoncillos("Suprimoh", 44);
		
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		
		kullen[2].setMarca("Suhermanoh");
		
		System.out.println();
		
		System.out.println("Segunda parte");
		
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		
		//kullen[3] = null;
		
		System.out.println();
		
		System.out.println("Tercera parte: ");
		
		for (int i = 0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		
		System.out.println();
		
		System.out.println("Cuarta parte: ");
		
		for (Calzoncillos item : kullen) {
			item.setTalla(36);
			System.out.println(item);
		}
	}
}
>>>>>>> 4f41d84 (Descripcion del commit)
