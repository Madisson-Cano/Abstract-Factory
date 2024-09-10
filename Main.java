package com.ejemplo.fabrica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaDispositivos fabricaApple = new FabricaApple();
        FabricaDispositivos fabricaSamsung = new FabricaSamsung();

        Telefono iphone = fabricaApple.crearTelefono();
        Tablet ipad = fabricaApple.crearTablet();
        
        Telefono galaxy = fabricaSamsung.crearTelefono();
        Tablet galaxyTab = fabricaSamsung.crearTablet();

        iphone.llamar();
        ipad.navegar();

        galaxy.llamar();
        galaxyTab.navegar();

	}

}
