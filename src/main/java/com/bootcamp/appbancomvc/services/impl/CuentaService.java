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
	public void modBalance(int numeroCuenta, float nuevoBalance) {
		Cuenta cuenta = fakeDBCuenta.getCuentaByNumero(numeroCuenta);
		if (cuenta != null) {
			cuenta.setBalance(nuevoBalance);
			fakeDBCuenta.mod(numeroCuenta, cuenta);
		}
	}

	@Override
	public Cuenta getCuentaByNumero(int numeroCuenta) {
		return fakeDBCuenta.getCuentaByNumero(numeroCuenta);
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
