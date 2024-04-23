package com.bootcamp.appbancomvc.services;

import com.bootcamp.appbancomvc.models.Cuenta;

import java.util.List;

public interface ICuentaService {

	int nuevaCuenta(Cuenta cuenta);

	boolean mod(int numeroCuenta, Cuenta cuenta);

	List<Cuenta> list();

	Cuenta delete(int id);
}
