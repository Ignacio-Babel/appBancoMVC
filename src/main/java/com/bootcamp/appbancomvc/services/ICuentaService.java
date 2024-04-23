package com.bootcamp.appbancomvc.services;

import com.bootcamp.appbancomvc.models.Cuenta;

import java.util.List;

public interface ICuentaService {

	int nuevaCuenta(Cuenta cuenta);

	void modBalance(int numeroCuenta, float nuevoBalance);

	Cuenta getCuentaByNumero(int numeroCuenta);

	List<Cuenta> list();

	Cuenta delete(int id);
}
