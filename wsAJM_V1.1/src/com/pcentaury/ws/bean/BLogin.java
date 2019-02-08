package com.pcentaury.ws.bean;

import java.io.Serializable;

public class BLogin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -470470744445909406L;
	private String usuario;
	private String password;
	private String mensaje;
	private Boolean acceso;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Boolean getAcceso() {
		return acceso;
	}
	public void setAcceso(Boolean acceso) {
		this.acceso = acceso;
	}

}
