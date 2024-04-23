package com.bootcamp.appbancomvc.controllers;

import com.bootcamp.appbancomvc.models.Cuenta;
import com.bootcamp.appbancomvc.services.ICuentaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cuentas")
public class CuentaController {

	ICuentaService cuentaService;

	public CuentaController(ICuentaService cuentaService){
		this.cuentaService = cuentaService;
	}
	@PostMapping
	public int nuevaCuenta(Cuenta cuenta) {
		return this.cuentaService.nuevaCuenta(cuenta);
	}

	@PutMapping("/{idCuenta}")
	public void mod(@PathVariable int idCuenta,@RequestBody Cuenta cuenta) {
		this.cuentaService.mod(idCuenta, cuenta);
	}

	@GetMapping
	public List<Cuenta> list() {
		return this.cuentaService.list();
	}

	@DeleteMapping("/{idCuenta}")
	public Cuenta delete(@PathVariable int idCuenta) {
		return this.cuentaService.delete(idCuenta);
	}
}
