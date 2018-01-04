package com.empresa.proyecto.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "personaMB")
@RequestScoped

public class PersonaManageBean {
	private String Nombre;
	private String Apellido;
	public PersonaManageBean() {
		
	}
	public String mostrarData() {
		return "/cliente/result";
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

}
