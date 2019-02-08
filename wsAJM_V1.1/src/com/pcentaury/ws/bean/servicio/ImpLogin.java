package com.pcentaury.ws.bean.servicio;

import com.pcentaury.ws.bean.BLogin;

public class ImpLogin implements Ilogin {

	@Override
	public BLogin autenticar(BLogin objRecibido) {
		// TODO Auto-generated method stub
		BLogin objC = new BLogin();
		objC.setUsuario("Alfred");
		objC.setPassword("12345");

		if (objRecibido.getUsuario().equals(objC.getUsuario())
				&& objRecibido.getPassword().equals(objC.getPassword())) {
			objC.setMensaje("Bienvenido...");
			objC.setAcceso(true);

		} else {
			objC.setMensaje(
					"Usuario " + objRecibido.getUsuario() + " No esta registrado o su contraseña es incorrecta");
			objC.setAcceso(false);

		}

		return objC;
	}

}
