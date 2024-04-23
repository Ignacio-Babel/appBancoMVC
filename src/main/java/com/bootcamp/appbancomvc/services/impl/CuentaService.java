package com.bootcamp.appbancomvc.services.impl;

import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.repositories.IFakeDBCuenta;
import com.bootcamp.appbancomvc.services.ICuentaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuentaService implements ICuentaService {
	IFakeDBCuenta fakeDBCuenta;

	public CuentaService(IFakeDBCuenta fakeDBCuenta) {
		this.fakeDBCuenta = fakeDBCuenta;
	}

	@Override
	public int nuevaCuenta(Cuenta cuenta) {
		return fakeDBCuenta.nuevaCuenta(cuenta);
	}

	@Override
	public boolean mod(int numeroCuenta, Cuenta cuenta) {

		return fakeDBCuenta.mod(numeroCuenta, cuenta);
	}

	@Override
	public List<Cuenta> list() {

		return fakeDBCuenta.list();
	}

	@Override
	public Cuenta delete(int id) {
		return fakeDBCuenta.delete(id);
	}
}
