package ar.edu.unju.fi.model;

public class Cliente {

	private GenericoDosAtributos<String, String> documentoIdentificaion;
	private String apellido;
	private String nombre;
	
	public Cliente() {
		
	}

	public Cliente(GenericoDosAtributos<String, String> documentoIdentificaion, String apellido, String nombre) {
		this.documentoIdentificaion = documentoIdentificaion;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public GenericoDosAtributos<String, String> getDocumentoIdentificaion() {
		return documentoIdentificaion;
	}

	public void setDocumentoIdentificaion(GenericoDosAtributos<String, String> documentoIdentificaion) {
		this.documentoIdentificaion = documentoIdentificaion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
