package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestCrearAutomovil {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		auto.setMarca("Audi");
		auto.setColor(Colores.AZUL);
		
		System.out.println("Marca: "+auto.getMarca());
		System.out.println("Color: "+auto.getColor());
	}

}
