package com.ejemplo.fabrica;

public class FabricaApple implements FabricaDispositivos {

	@Override
	public Telefono crearTelefono() {
		// TODO Auto-generated method stub
		return new iPhone();
	}

	@Override
	public Tablet crearTablet() {
		// TODO Auto-generated method stub
		return new iPad();
	}

}
