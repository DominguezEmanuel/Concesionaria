package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.GenericoDosAtributos;

public class TestGenerico {

	public static void main(String[] args) {
		
		GenericoDosAtributos<Integer, Integer> telefono = 
				new GenericoDosAtributos<Integer, Integer>(388, 5081562);
				
		GenericoDosAtributos<String, String> documento =
				new GenericoDosAtributos<String, String>("DNI", "45253761");
		
		System.out.println(telefono.getNumero());
		System.out.println(documento.getNumero());
		
	}

}
