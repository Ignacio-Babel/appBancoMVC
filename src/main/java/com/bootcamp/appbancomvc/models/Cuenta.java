package com.bootcamp.appbancomvc.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cuenta {
	private int numeroCuenta;
	private int sucursalId;
	private int clienteId;
	private float balance;

	@Override
	public String toString() {
		return "Cuenta{" +
				"numeroCuenta=" + numeroCuenta +
				", balance=" + balance +
				'}';
	}
}


