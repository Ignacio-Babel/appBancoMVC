package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.models.Sucursal;

import java.util.List;

public interface ICuentaController {
	int nuevaCuenta( Cuenta cuenta);
	void mod( int idCuenta,  Cuenta cuenta);
	List<Cuenta> list();
	Cuenta delete(int idCuenta);
}
