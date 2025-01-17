package edu.alonso.tema3;

public class InitOperaciónBancaria {

	public static void main(String[] args) {
		PersonaCliente cliente = new PersonaCliente("Juan", 12345678, "Pérez", 30);
		Domicilio domicilio = new Domicilio(" Calle Falsa ", 2, 4, 1);
		OperaciónBancaria operacion = new OperaciónBancaria(cliente, null, domicilio);
		Transferencia IBANDestino = new Transferencia();
		Bizum Telefonos = new Bizum(623456781, 692345678);
		System.out.println(operacion);
		System.out.println(IBANDestino);
		System.out.println(Telefonos);
	}
}
