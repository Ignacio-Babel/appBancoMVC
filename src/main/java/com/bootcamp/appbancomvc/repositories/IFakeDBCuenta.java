package com.bootcamp.appbancomvc.repositories;

import com.bootcamp.appbancomvc.models.Cuenta;

import java.util.List;

public interface IFakeDBCuenta {

	 int nuevaCuenta(Cuenta cuenta);

	Cuenta getCuentaByNumero(int numeroCuenta);

	boolean mod(int numeroCuenta, Cuenta cuenta);

	 List<Cuenta> list();

	 Cuenta delete(int id);
}
