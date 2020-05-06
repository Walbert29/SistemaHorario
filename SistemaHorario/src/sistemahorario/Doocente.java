/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahorario;

/**
 *
 * @author Walbert
 */
public class Doocente {
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Doocente(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
	String nombre;
	
}
