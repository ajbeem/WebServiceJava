package com.pcentaury.ws.cliente;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.pcentaury.ws.bean.BLogin;
import com.pcentaury.ws.bean.servicio.ImpLogin;
import com.pcentaury.ws.bean.servicio.ImpLoginProxy;

public class Principal {
	public Principal(String name, String pswd) {
		ImpLogin ws = new ImpLoginProxy("http://localhost:8083/wsAJM_V1.1/services/ImpLogin");
		
		BLogin objEnviar = new BLogin();
		objEnviar.setUsuario(name);
		objEnviar.setPassword(pswd);
		
		try {
			objEnviar = ws.autenticar(objEnviar);
			
			if (objEnviar.getAcceso()) {
				System.out.println(objEnviar.getMensaje().toString());
				
			} else {
				System.out.println(objEnviar.getMensaje().toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR DE COMUNICACION"+ e.toString());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre");
		String contra = JOptionPane.showInputDialog(null, "Ingresa tu contraseña");
		Principal obj1= new Principal(nombre, contra);		
		
	}

}
