package co.edu.tdea.clase10;

import java.time.LocalDate;

public class Personal {
	private String nombre;
	private String apellidos;
	private LocalDate fechaContratacio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaContratacio() {
		return fechaContratacio;
	}
	public void setFechaContratacio(LocalDate fechaContratacio) {
		this.fechaContratacio = fechaContratacio;
	}
	
	
}
