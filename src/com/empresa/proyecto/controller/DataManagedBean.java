package com.empresa.proyecto.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "data")
@RequestScoped
public class DataManagedBean {
	private String Nombre;

	public DataManagedBean() {
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String result() {
		return "/demo/result";
	}
	

}
