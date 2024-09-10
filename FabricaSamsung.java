package com.ejemplo.fabrica;

public class FabricaSamsung implements FabricaDispositivos {

	@Override
	public Telefono crearTelefono() {
		// TODO Auto-generated method stub
		return new Galaxy();
	}

	@Override
	public Tablet crearTablet() {
		// TODO Auto-generated method stub
		return new GalaxyTab();
	}

}
