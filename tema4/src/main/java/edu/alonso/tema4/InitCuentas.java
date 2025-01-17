<<<<<<< HEAD
package edu.alonso.tema4;

public class InitCuentas {

	
	public static void main(String[] args) {
		
		Cuentas cuenta[] = new Cuentas[3];
		cuenta [0] = new Cuentas ("Paco", "ES8204876632514546536218", 1000000);
		cuenta [1] = new Cuentas ("Pepe", "ES6101287458165825538474", 10000);
		cuenta [2] = new Cuentas ("Juan", "ES1914651489017573997482", 5500);
		
		
		for (Cuentas item : cuenta) {
			if (item.getDinero() >= 1000000) {
				item.setDinero(item.getDinero() * 1.01);
			}
			
			System.out.println(item);
		}
	}
}
=======
package edu.alonso.tema4;

public class InitCuentas {

	
	public static void main(String[] args) {
		
		Cuentas cuenta[] = new Cuentas[3];
		cuenta [0] = new Cuentas ("Paco", "ES8204876632514546536218", 1000000);
		cuenta [1] = new Cuentas ("Pepe", "ES6101287458165825538474", 10000);
		cuenta [2] = new Cuentas ("Juan", "ES1914651489017573997482", 5500);
		
		
		for (Cuentas item : cuenta) {
			if (item.getDinero() >= 1000000) {
				item.setDinero(item.getDinero() * 1.01);
			}
			
			System.out.println(item);
		}
	}
}
>>>>>>> 4f41d84 (Descripcion del commit)
