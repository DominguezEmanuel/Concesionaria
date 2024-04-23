package ar.edu.unju.fi.test;

import java.util.ArrayList;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.model.GenericoDosAtributos;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Automovil> catalogo = new ArrayList<>();
		
		Colores colorAuto = Colores.valueOf("NEGRO");
		Automovil auto = new Automovil("ABC123", "Audi", "RMX", 
				(short)2015, 2500000.0,  colorAuto);
		Automovil auto2 = new Automovil("DEF456", "Renault", "Clio", 
				(short)2020, 2900000.0,  Colores.ROJO);
		
		catalogo.add(auto);
		catalogo.add(auto2);
		
		
		//GenericoDosAtributos<String, String> documento = new GenericoDosAtributos<>();
		//documento.setCodigo("DNI");
		//documento.setNumero("45253761");
		//Cliente cliente = new Cliente(documento, "Dominguez", "Emanuel");
		
		//catalogo.add(cliente);
		
		for(Automovil autos:catalogo) {
			System.out.println(autos);
		}
	}

}
