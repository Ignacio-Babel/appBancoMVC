package com.bootcamp.appbancomvc.repositories.impl;

import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.repositories.IFakeDBCuenta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDBCuenta implements IFakeDBCuenta {
	List<Cuenta> cuentas;

	public FakeDBCuenta() {
		cuentas = new ArrayList<>();
	}

	@Override
	public int nuevaCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
		return cuenta.getNumeroCuenta();
	}

	@Override
	public Cuenta getCuentaByNumero(int numeroCuenta) {
		for (Cuenta cuenta : cuentas) {
			if (cuenta.getNumeroCuenta() == numeroCuenta) {
				return cuenta;
			}
		}
		return null;
	}

	@Override
	public boolean mod(int numeroCuenta, Cuenta cuenta) {
		for (int i = 0; i < cuentas.size(); i++) {
			if (numeroCuenta == cuentas.get(i).getNumeroCuenta()) {
				cuentas.set(i, cuenta);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Cuenta> list() {
		return cuentas;
	}

	@Override
	public Cuenta delete(int id) {
		for (int i = 0; i < cuentas.size(); i++) {
			if (id == cuentas.get(i).getNumeroCuenta()) {
				return cuentas.remove(i);
			}
		}
		return null;
	}
}
